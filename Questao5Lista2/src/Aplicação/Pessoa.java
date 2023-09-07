package Aplicação;

public class Pessoa {
	private String Nome;
	private int Telefone;
	private String Email;
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setTelefone(int Telefone) {
		this.Telefone = Telefone;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getNome() {
		return Nome;
	}
	public int getTelefone() {
		return Telefone;
	}
	public String getEmail() {
		return Email;
	}
	public String Estado() {
		return (Nome+" "+Telefone+" "+Email+" ");
	}
	
}
