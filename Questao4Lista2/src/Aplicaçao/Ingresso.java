package Aplicaçao;

public class Ingresso {
	private int Id;
	private int Cpf;
	private String NomeF;
	private int NPoltrona;
	private int Valor;

	public void setCpf(int Cpf) {
		this.Cpf = Cpf;
	}

	public void setNomeF(String NomeF) {
		this.NomeF = NomeF;
	}

	public void setValor(int Valor) {
		this.Valor = Valor;
	}

	public void setNpoltrona(int Npoltrona) {
		this.NPoltrona = Npoltrona;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public int getId() {
		return Id;
	}

	public String getNomeF() {
		return NomeF;
	}

	public int getValor() {
		return Valor;
	}

	public int getCpf() {
		return Cpf;
	}

	public int getNPoltrona() {
		return NPoltrona;
	}
}
