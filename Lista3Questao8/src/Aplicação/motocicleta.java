package Aplicação;

public class motocicleta extends Veiculo implements Movimento {
private int qtdCilindradas;
private int Tempo0a100;
public motocicleta() {
	
}
public motocicleta(int Tempo0a100,int qtdCilindradas) {
	this.qtdCilindradas=qtdCilindradas;
	this.Tempo0a100=Tempo0a100;
}
public void setqtdCilindradas(int Cilindradas) {
	this.qtdCilindradas=Cilindradas;
}
public void setTempo0a100(int Tempo) {
	this.Tempo0a100=Tempo;
}
public int getqtdCilindras() {
	return qtdCilindradas;
}
public int getTempo0a100() {
	return Tempo0a100;
}
public void freiar() {
	motocicleta m = new motocicleta();
	m.setVelocidade(m.getVelocidade()-5);
}
public String ligar() {
	return "A moto está ligada";
}
public String desligar() {
	return "A moto está desligada";
}

}
