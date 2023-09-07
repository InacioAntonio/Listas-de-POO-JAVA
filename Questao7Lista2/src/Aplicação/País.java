package Aplicação;
import java.util.ArrayList;
public class País {
	private String Nome;
	private float Dimensao;
	private String Capital;
	private ArrayList<País> Fronteira;
	public País(String Nome,float Dimensao,String Capital) {
		this.Nome=Nome;
		this.Dimensao=Dimensao;
		this.Capital=Capital;
		ArrayList<País>Fronteira=new ArrayList<País>();
	}
	public String getNome() {
		return Nome;
	}
	public float getDimensao() {
		return Dimensao;
	}
	public String getCapital() {
		return Capital;
	}
	public ArrayList<País> getFronteira() {
		return Fronteira;
	}
	public void setNome(String Nome) {
		this.Nome=Nome;
	}
	public void setDimensao(float Dimensao) {
		this.Dimensao=Dimensao;
	}
	public void setCapital(String Capital) {
		this.Capital=Capital;
	}
	public boolean Equals(País p) {
		if(p.getCapital().equals(this.Capital)&& p.getNome().equals(this.Nome)) {
			return true;
		}else {
			return false;
		}
	}
	public void AdicionarPaisF(ArrayList<País>Fronteira) {
		this.Fronteira=Fronteira;
	}
	public ArrayList<País> VizinhosComuns(País p) {
		ArrayList<País>Vizinhos = new ArrayList<País>();
		for (int i=0;i<this.Fronteira.size();i++) {
			País atual = this.Fronteira.get(i);
				if(p.getFronteira().contains(atual)){
					Vizinhos.add(atual);
				}
		}
		return Vizinhos;
	}
	
	
}
