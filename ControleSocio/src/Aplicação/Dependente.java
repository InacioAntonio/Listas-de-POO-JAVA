package Aplicação;

public class Dependente {
private int Id;
private String Nome;
private int Idade;
private String cpf;
public Dependente() {
	
}
public Dependente(int Id,String Nome,int Idade,String cpf) {
	this.Id=Id;
	this.Idade=Idade;
	this.Nome=Nome;
	this.cpf = cpf;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public int getIdade() {
	return Idade;
}
public void setIdade(int idade) {
	Idade = idade;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}

}
