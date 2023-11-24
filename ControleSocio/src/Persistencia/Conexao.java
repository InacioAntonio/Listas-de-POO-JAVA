package Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
	private String usuario;
	private String senha;
	private String caminho;
	private Connection con;
	public Conexao() {
		caminho = "jdbc:postgresql://localhost:5432/BDSOCIO";
		usuario = "postgres";
		senha = "1234";
	}
	public Conexao(String c,String u,String s) {
		caminho =c;
		usuario=u;
		senha=s;
	}
	public void Conectar() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(caminho,usuario,senha);
		}catch(Exception e) {
			System.out.println("Erro na conexão: "+e.getMessage());
		}
	}
	public void Desconectar() {
		try {
			con.close();
		}catch(Exception e) {
			System.out.println("Erro na desconexão: "+e.getMessage());
		}
	}
	public Connection getConexao() {
		return con;
		}
	
	}
	
