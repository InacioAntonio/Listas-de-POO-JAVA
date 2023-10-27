package Aplicação;

public class ClassePessoa implements Pessoa {
	private String Cpf;
	private String Nome;
	public void setNome(String Nome) {
		this.Nome=Nome;
	}
	public void setCpf(String Cpf) {
		this.Cpf=Cpf;
	}
	public String getNome() {
		return Nome;
	}
	public String getCPF() {
		return Cpf;
	}
	
}
