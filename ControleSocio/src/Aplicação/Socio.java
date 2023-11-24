package Aplicação;

public class Socio {
	private String cpf;
	private String nome;
	private String data;
	public Socio() {
		
	}
	public Socio(String cpf,String nome,String data) {
		this.cpf=cpf;
		this.nome=nome;
		this.data=data;
		
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_adm() {
		return data;
	}
	public void setData_adm(String data) {
		this.data = data;
	}
	
}
