package Aplicação;

public class Música {
private String Nome;
private int Duracao;
private String Nartista;
public  Música(){
	
}
public void setNome(String Nome) {
	this.Nome=Nome;
}
public void setDuracao(int Duracao) {
	this.Duracao=Duracao;
}
public void setNartista(String Nartista) {
	this.Nartista=Nartista;
}
public String getNome() {
	return Nome;
}
public int getDuracao() {
	return Duracao;
}
public String getNartista() {
	return Nartista;
}
public void Tocar() {
	int i;
	for(i=0;i<Duracao;i++) {
		Duracao--;
	}
}
public void Pausar() {
	
}

}
