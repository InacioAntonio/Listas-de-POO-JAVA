package Aplicação;

public abstract class Veiculo {
private float Velocidade;
private float Peso;
private int qtdrodas;
public void setVelocidade(float Velocidade) {
	this.Velocidade=Velocidade;
}
public void setPeso(float Peso) {
	this.Peso=Peso;
}
public void setqtdrodas(int rodas ) {
	this.qtdrodas=rodas;
}
public float getVelocidade() {
	return Velocidade;
}
public float getPeso() {
	return Peso;
}
public float getqtdrodas() {
	return qtdrodas;
}

}
