package Aplicação;

public class VooMarcado extends Voo {
	private int Fumantes;
	private int Nfumantes;
	private int quantidadeL;
	public VooMarcado(Data d,int Fumantes,int quantidadeL) {
		super(d);
		this.quantidadeL=quantidadeL;
		this.Fumantes=Fumantes;
		this.Fumantes=Fumantes;
		super.setLugares(quantidadeL);
	}
	public void MaxVagas(int quantidadeL) {
		this.quantidadeL=quantidadeL;
	}
	public void CadeirasF(int Fumantes) {
		if(Fumantes<quantidadeL ) {
			this.Fumantes=Fumantes;
		this.Nfumantes=(quantidadeL-Fumantes);
		}
		
	}
	public String Tipo(int n) {
		if(n>Nfumantes) {
			return "F";
		}else {
			return "N";
		}
	}
	
}
