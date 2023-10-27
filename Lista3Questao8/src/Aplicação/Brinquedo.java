package Aplicação;

public class Brinquedo extends Veiculo implements Movimento {
private float preco;
private String material;
public String ligar() {
	return "O brinquedo está Ligado";
}
public String desligar() {
	return "O brinquedo está Desligado";
}
public void freiar() {
	Brinquedo b = new Brinquedo();
	b.setVelocidade(getVelocidade()-2);
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}

}
