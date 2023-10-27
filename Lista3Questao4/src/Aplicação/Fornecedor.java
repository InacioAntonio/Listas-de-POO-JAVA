package Aplicação;

public class Fornecedor extends Pessoa {
private float ValorCredito;//(correspondente ao crédito máximo atribuído ao fornecedor
private float ValorDivida;//montante da dívida para com o fornecedor
public void SetValorCredito(float ValorCredito) {
	this.ValorCredito=ValorCredito;
}
public void setValorDivida(float ValorDivida) {
	this.ValorDivida=ValorDivida;
}
public float getValorCredito() {
	return ValorCredito;
}
public float getValorDivida() {
	return ValorDivida;
}
public float ObterSaldo() {
	return ValorCredito-ValorDivida;
}
}
