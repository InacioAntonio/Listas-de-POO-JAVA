package Persistencia;
//import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Aplicação.*;
public class SocioDAO {
	private String inc = "insert into \"tabelasocio\"(cpf,nome,data) values(?,?,?)";
	private String bus = "select * from \"tabelasocio\" where \"cpf\" = ? ";
	private String upt = "update \"tabelasocio\" set \"cpf\"=?,\"nome\" = ?,\"data\" = ? where \"cpf\" = ? ";
	private String del = "delete from tabelasocio where \"cpf\" = ?";
	private String rel = "select * from \"tabelasocio\" ";
	private String pesq = "update \"tabeladependente\" set \"cpf\" ='0' where \"cpf\" = ?";
	private String uptd = "update \"tabeladependente\" set \"cpf\" = ? where \"cpf\" = '0' ";
	private Conexao c;
	
	public SocioDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/BDSOCIO","postgres","1234");
	}
	public ArrayList<Socio> Relatorio(){
		ArrayList<Socio> lista = new ArrayList<>();
		try {
			c.Conectar();
			Statement instrução = c.getConexao().createStatement();
			ResultSet rs = instrução.executeQuery(rel);
			while(rs.next()) {
				Socio socio = new Socio(rs.getString("cpf"),rs.getString("nome"),rs.getString("data"));
				lista.add(socio);		
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Não foi Possivel mostrar a Lista"+e);
		}catch(Exception e) {
			System.out.println("Não foi Possivel mostrar a Lista"+e);
		}
		return lista;
	}
	public void Deletar(String auxcpf) {
		boolean existe = false;
		Socio teste = null;
		//ArrayList<Dependente> lista = new ArrayList<>();
		try {
			c.Conectar();
			DependenteDAO dd = new DependenteDAO();
			SocioDAO s = new SocioDAO();
			teste = s.Buscar(auxcpf);
			if(teste != null) {
				existe = true;
			}
			if (existe) {
				dd.DeletarTodos(teste);
				PreparedStatement instrução = c.getConexao().prepareStatement(del);
				instrução.setString(1, teste.getCPF());
				instrução.executeUpdate();
				instrução.close();
			}else {
				System.out.println("Incorreto esses Dados");
			}
			c.Desconectar();
		}catch(SQLException e ) {
			System.out.println("Deu erro"+e);
		}catch(Exception e ) {
			System.out.println("Deu erro"+e);
		}
	}
	public void Atualizar(Socio socio) {
		boolean existe = false;
		Socio teste = null;
		try {
			c.Conectar();
			SocioDAO s = new SocioDAO();
			teste = s.Buscar(socio.getCPF());
			if(teste !=null) {
				existe = true;
			}
			if (existe) {
				
				PreparedStatement instrução = c.getConexao().prepareStatement(upt);
				instrução.setString(1, socio.getCPF());
				instrução.setString(2, socio.getNome());
				instrução.setString(3, socio.getData_adm());
				instrução.setString(4, socio.getCPF());
				instrução.executeUpdate();
				instrução.close();
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Erro na atualização"+e);
		}catch(Exception e) {
			System.out.println("Erro na atualização"+e);
		}
		
	}
		public void AtualizarCPF(Socio socio, String auxcpf) {
			//boolean existe = false;
			Socio teste = null;
			try {
				c.Conectar();
				SocioDAO s = new SocioDAO();
				teste = s.Buscar(socio.getCPF());
				if (teste != null) {
					PreparedStatement ins = c.getConexao().prepareStatement(pesq);
					ins.setString(1, socio.getCPF());
					ins.execute();
					ins = c.getConexao().prepareStatement(upt);
					ins.setString(1,auxcpf);
					ins.setString(2, socio.getNome());
					ins.setString(3, socio.getData_adm());
					ins.setString(4,socio.getCPF());
					ins.execute();
					ins = c.getConexao().prepareStatement(uptd);
					ins.setString(1, auxcpf);
					ins.execute();
					//ins.executeUpdate();
					ins.close();
					
				}
				c.Desconectar();
			}catch(SQLException e) {
				System.out.println("Aconteceu um erro na hora de atulizar os Dados "+e);
			}catch(Exception e) {
				System.out.println("Aconteceu um erro na hora de atualizar os Dados "+e);
			}
			
		}
	public void Incluir(Socio socio) {
		boolean existe = false;
		Socio teste = null;
		SocioDAO s = new SocioDAO();
		try {
			c.Conectar();
			teste = s.Buscar(socio.getCPF());
			if (teste != null) {
				existe = true;
				System.out.println("Esse CPF Já Foi Cadastrado");
			}else {
				PreparedStatement instrução = c.getConexao().prepareStatement(inc);
				instrução.setString(1, socio.getCPF());
				System.out.println(socio.getNome());
				instrução.setString(2, socio.getNome());
				instrução.setString(3, socio.getData_adm());
				instrução.executeUpdate();
				instrução.close();
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Erro na Inclusão"+e);
		}catch(Exception e) {
			System.out.println("Erro na Inclusão"+e);
		}
	}
	public Socio Buscar(String CPFaux) {
		Socio s = null;
		try {
			c.Conectar();
			PreparedStatement instrução = c.getConexao().prepareStatement(bus);
			instrução.setString(1,CPFaux);
			ResultSet rs = instrução.executeQuery();
			if (rs.next()) {
				s = new Socio(rs.getString("cpf"),rs.getString("nome"),rs.getString("data"));
			}
			c.Desconectar();
		}catch(SQLException e) {
			System.out.println("Erro na busca"+e);
		}catch(Exception e ) {
			System.out.println("Erro na busca"+e);
		}
		return s;
	}
		
	
}
