package Aplicação;

public class Carro extends Veiculo implements Movimento {
private String Motor;
private int qtdPortas;
private String TipoCambio;
public void setMotor(String Motor) {
	this.Motor=Motor;
}
public void setqtdPortas(int qtdPortas) {
	this.qtdPortas=qtdPortas;
}
public void setTipoCambio(String TipoCambio) {
	this.TipoCambio=TipoCambio;
}
public String getMotor() {
	return Motor;
}
public int getqtdPortas() {
	return qtdPortas;
}
public String getTipoCambio() {
	return TipoCambio;
}
public String ligar() {
	return "O carro Está ligado";
}
public String desligar() {
	return "O carro Está desligado";
}
public void freiar() {
	Carro c = new Carro();
	c.setVelocidade(c.getVelocidade()-15);
}

}
