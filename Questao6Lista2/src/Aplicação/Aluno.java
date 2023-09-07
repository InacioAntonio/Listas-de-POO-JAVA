package Aplicação;

public class Aluno {
	private String Nome;
	private int Matricula;
	private float NotaTrabalho;
	private float Nota1;
	private float Nota2;

	public Aluno(String nome2, int matricula2, float notaTrabalho2, float nota12, float nota22) {
		this.Matricula=matricula2;
		this.Nome=nome2;
		this.NotaTrabalho=notaTrabalho2;
		this.Nota1=nota12;
		this.Nota2=nota22;
	}

	public float Media() {
		float media = (float) (((Nota1 * 2.5) + (Nota2 * 2.5) + (NotaTrabalho * 2))) / 7;
		return media;
	}

	public float Final() {
		float media = (float) (((Nota1 * 2.5) + (Nota2 * 2.5) + (NotaTrabalho * 2))) / 7;
		if (media < 5) {
			float precisa = media - 5;
			return precisa;
		} else {
			return 0;
		}
	}

	public String Estado(float media, float precisa) {
		return ("Nome:" + Nome + "Matricula: " + Matricula + "NotaTrabalho:" + NotaTrabalho + "Notas: " + Nota1 + Nota2
				+ "Media" + media + "Na final precisa de:" + precisa);
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public void setMatricula(int Matricula) {
		this.Matricula = Matricula;
	}

	public void setNotaTrabalho(float NotaTrabalho) {
		this.NotaTrabalho = NotaTrabalho;
	}

	public void setNota1(float Nota1) {
		this.Nota1 = Nota1;
	}

	public void setNota2(float Nota2) {
		this.Nota2 = Nota2;
	}

	public String getNome() {
		return Nome;
	}

	public int getMatricula() {
		return Matricula;
	}

	public float getNota1() {
		return Nota1;
	}

	public float getNota2() {
		return Nota2;
	}

	public float getNotaTrabalho() {
		return NotaTrabalho;
	}

}
