package Aplicação;

public class Robo {
	private int linha;//Represetam a posição atual do robo
	private int coluna;//Represetam a posição atual do robo
	private int passo;// representa de quantos em quantos pontos o robo se locomove a cada vez
	public Robo() {
		linha = 0;
		coluna =0;
		passo = 0;
	}
	public int[] MostrarPosicaoAtual(){
		int[] array = { linha , coluna };
		 return array;
	}
	public void AndarPraFrente() {
		coluna+=passo;
	}
	public void AndarTras() {
		coluna-=passo;
	}
	public void AndarDireita() {
		linha+=passo;
	}
	public void AndarEsquerda() {
		linha-=passo;
	}
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	public int getPasso() {
		return passo;
	}
	public void setPasso(int Passo) {
		this.passo = Passo;
	}
	public void setColuna(int Coluna) {
		this.coluna = Coluna;
	}
	public void setLinha(int Linha) {
		this.linha = Linha;
	}
	
}
