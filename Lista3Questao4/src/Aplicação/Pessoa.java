package Aplicação;

public class Pessoa {
private String Nome;
private String Endereço;
private int Telefone;

public void setNome(String Nome) {
	this.Nome=Nome;
}
public void setEndereço(String Endereço) {
	this.Endereço=Endereço;
}
public void setTelefone(int Telefone) {
	this.Telefone=Telefone;
}
public int getTelefone() {
	return Telefone;
}
public String getNome() {
	return Nome;
}
public String getEndereço() {
	return Endereço;
}
}
