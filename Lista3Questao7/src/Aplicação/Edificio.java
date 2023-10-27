package Aplicação;
import java.util.ArrayList;
public class Edificio extends Casa {
	//private String Cor;
	private int TotalPortas;
	private int TotalAndares;
	private ArrayList<Porta> qtdPortas;
	public Edificio() {
		ArrayList<Porta>qtdPortas = new ArrayList<>(); 
		TotalPortas=0;
		TotalAndares=0;
	}
	public void AdicionaPorta(Porta p) {
		qtdPortas.add(p);
		TotalPortas++;
	}
	public int getTotalAndares() {
		return TotalAndares;
	}
	public void AdicionaAndar() {
		TotalAndares++;
	}
	public int getTotalPortas() {
		return TotalPortas;
	}
	public void setArrayPorta(ArrayList<Porta> p) {
		this.qtdPortas=p;
	}
}
