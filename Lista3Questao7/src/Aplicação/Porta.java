package Aplicação;

public class Porta {
	private boolean aberta;
	private String Cor;
	private float dimensaoX;
	private float dimensaoY;
	private float dimensaoZ;
	public Porta(String Cor,float dimensaoX,float dimensaoY,float dimensaoZ) {
		this.dimensaoX=dimensaoX;
		this.dimensaoY=dimensaoY;
		this.dimensaoZ=dimensaoZ;
		this.Cor=Cor;
	}
	public Porta() {
		
	}
	public String getCor() {
		return Cor;
	}
	public float getdimensaoX() {
		return dimensaoX;
	}
	public float getDimensaoY() {
		return dimensaoY;
	}
	public float getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX=dimensaoX;
	}
	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY=dimensaoY;
	}
	public void setDimensaoZ(float dimensaoZ) {
		this.dimensaoZ=dimensaoZ;
	}
	public void Pinta(String Cor) {
		this.Cor=Cor;
	}
	public void Abre() {
		this.aberta=true;
	}
	public boolean estaAberta() {
		if(aberta) {
			return true;
		}else {
			return false;
		}
	}
}
