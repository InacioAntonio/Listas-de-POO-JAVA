package Persistencia;
//import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Aplicação.*;
public class DependenteDAO {
	private String bus = "select * from \"tabeladependente\" where \"id\" = ?" ; 
	private String inc = " insert into \"tabeladependente\"(id,nome_d,idade,cpf) VALUES (?,?,?,?)";
	private String exc = "delete from \"tabeladependente\" where \"id\" = ?";
	private String rel = "select * from \"tabeladependente\" where \"cpf\" = ?";
	private String relexc ="delete from \"tabeladependente\" where \"cpf\" = ?";
	private String uptd = "update \"tabeladependente\" set \"id\" =?, \"nome_d\" = ?, \"idade\" = ?, \"cpf\" = ? where \"id\" = ?  ";
	private Conexao c;
	
	public DependenteDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/BDSOCIO","postgres","1234");
	}
	public Dependente Buscar(int IdAux) {
		Dependente d = null;
		try {
			c.Conectar();
			PreparedStatement instrução = c.getConexao().prepareStatement(bus);
			instrução.setInt(1,IdAux);
			ResultSet rs = instrução.executeQuery();
			if (rs.next()) {
				d = new Dependente (rs.getInt("id"),rs.getString("nome_d"),rs.getInt("idade"),rs.getString("cpf"));
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Erro na Busca"+e);
		}catch(Exception e) {
			System.out.println("Erro na Busca"+e);
		}
		return d;
	}
	public void Adicionar(Dependente d) {
		boolean existe = false;
		Dependente teste = null;
		DependenteDAO dd = new DependenteDAO();
		SocioDAO sd = new SocioDAO();
		Socio testes = null;
		try {
			c.Conectar();
			teste = dd.Buscar(d.getId());
			if (teste !=null) {
				existe = true;
			}
			if (!existe) {
				testes = sd.Buscar(d.getCpf());
				if (testes != null) {
					PreparedStatement instrução = c.getConexao().prepareStatement(inc);
				instrução.setInt(1, d.getId());
				instrução.setString(2, d.getNome());
				instrução.setInt(3, d.getIdade());
				instrução.setString(4,d.getCpf());
				instrução.executeUpdate();
				instrução.close();
				}else {
					System.out.println("Cpf digitado não Corresponde a nenhum socio");
				}
				
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Inserção mal Sucedida"+e);
		}catch(Exception e) {
			System.out.println("Inserção mal Sucedida "+e);
		}
	}
	public void Deletar(Dependente dependente) {
		boolean existe = false;
		Dependente teste = null;
		DependenteDAO d = new DependenteDAO();
		try {
			c.Conectar();
			teste = d.Buscar(dependente.getId());
			if (teste != null) {
				existe = true;
			}
			if (existe) {
				int auxid = dependente.getId();
				PreparedStatement instrução = c.getConexao().prepareStatement(exc);
				instrução.setInt(1,auxid);
				instrução.executeUpdate();
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Não foi possivel Apagar"+e);
		}catch(Exception e ) {
			System.out.println("Não foi possivel Apagar "+e);
		}
	}
	public ArrayList<Dependente> relatorio(Socio socio){
		ArrayList<Dependente> lista = new ArrayList<Dependente>();
		Dependente dependente;
		boolean existe = false;
		Socio teste = null;
		try {
			c.Conectar();
			SocioDAO d = new SocioDAO();
			teste = d.Buscar(socio.getCPF());
			if(teste != null) {
				existe = true;
			}
			if (existe) {
				String aux = socio.getCPF();
				PreparedStatement instrução = c.getConexao().prepareStatement(rel);
				instrução.setString(1,aux);
				ResultSet rs = instrução.executeQuery();
				while(rs.next()) {
					dependente = new Dependente(rs.getInt("id"),rs.getString("nome_d"),rs.getInt("idade"),rs.getString("cpf"));
					lista.add(dependente);
				}
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Erro no relatorio"+e);
		}catch(Exception e ) {
			System.out.println("Erro no relatorio"+e);
		}
		return lista;
	}
	public void DeletarTodos(Socio socio) {
		//boolean existe = false;
		Socio teste = null;
		try {
			c.Conectar();
			SocioDAO sd = new SocioDAO();
			teste = sd.Buscar(socio.getCPF());
			if (teste != null) {
				PreparedStatement instrução = c.getConexao().prepareStatement(relexc);
				instrução.setString(1,socio.getCPF());
				instrução.executeUpdate();
				instrução.close();
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Seu Delete deu um erro"+e);
		}catch(Exception e) {
			System.out.println("Seu Delete deu um erro"+e);
		}
		
		
	}
	public void Atualizar(Dependente dependente,int auxId) {
		//boolean existe = false;
		Socio teste = null;
		SocioDAO sd = new SocioDAO();
		DependenteDAO dd = new DependenteDAO();
		try {
			teste = sd.Buscar(dependente.getCpf());
			c.Conectar();
			if(teste!=null) {
				Dependente testeD = dd.Buscar(auxId);
				if (testeD == null) {
					PreparedStatement instrução = c.getConexao().prepareStatement(uptd);
				instrução.setInt(1, dependente.getId());
				instrução.setString(2, dependente.getNome());
				instrução.setInt(3, dependente.getIdade());
				instrução.setString(4, dependente.getCpf());
				instrução.setInt(5, auxId);
				instrução.execute();
				instrução.close();
				}else {
					System.out.println("");
				}
			}else {
				System.out.println("Esse Cpf não pertence a nenhum socio");
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Problema na alteração dos dados"+e);
		}catch(Exception e) {
			System.out.println("Problema na alteração dos dados"+e);
		}
	}
}

