package Aplicação;

public class Cachorro {
	private String Nome;
	private String Raca;
	private int Idade;
	public Cachorro(String Nome,String Raca,int Idade) {
		this.Idade = Idade;
		this.Nome = Nome;
		this.Raca = Raca;
		
	}
	public Cachorro() {
		
	}
	public String InformarEstado() {
		return ("O nome do cachorro é"+Nome+"A raça do cachorro é"+Raca+"A idade dele é "+Idade);
	}
	public Cachorro ClonarCachorro() {
		return new Cachorro(Nome,Raca,Idade);
	}
	public String getNome() {
		return Nome;
	}
	public String getRaca() {
		return Raca;
	}
	public int getIdade() {
		return Idade;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setRaca(String Raca) {
		this.Raca = Raca;
	}
	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	
}
