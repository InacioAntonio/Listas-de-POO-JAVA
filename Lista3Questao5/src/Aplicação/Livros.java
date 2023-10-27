package Aplicação;

public class Livros extends Colecionavéis {
	private String NomeEditora;
	private int AnoPubli;
	public void setNomeEditora(String NomeEditora) {
		this.NomeEditora=NomeEditora;
	}
	public void setAnoPubli(int AnoPubli) {
		this.AnoPubli=AnoPubli;
	}
	public String getNomeEditora() {
		return NomeEditora;
	}
	public int AnoPubli() {
		return AnoPubli;
	}
}
