package Aplicação;

public class Aluno {

	private String Nome;
	private int Matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float Media;
	private String Situacao;
	public Aluno() {
		
	}
	public void SetNome(String Novonome) {
		this.Nome = Novonome;
	}
	public void SetMatricula(int novaMat ) {
		this.Matricula = novaMat;
	}
	public void SetNotas(float n1, float n2 , float n3) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		
	}
	public void CalcularMedia( ) {
		Media = (nota1*4+nota2*5+nota3*6)/15;
		if(Media >= 7) {
			Situacao = ("Aprovado");
		}else {
			if(Media < 3 ) {
				Situacao = ("Reprovado");
			}else {
				Situacao = ("Recuperacao");
			}
		}
	}
	public boolean BuscarAluno(int matricula) {
		if(matricula == this.Matricula) {
			return true;
		}else {
			return false;
		}
		
	}
	public String GetNome() {
		return Nome;
	}
	public int GetMatricula() {
		return Matricula;
	}
	public float GetNota1() {
		return nota1;
	}
	public float GetNota2() {
		return nota2;
	}
	public float GetNota3() {
		return nota3;
	}
	public float GetMedia() {
		return Media;
	}
	public String GetSituacao() {
		return  Situacao;
	}
	public String alterarNota(int CodNota, float ValorNota ) {
		switch(CodNota) {
		case 1:
			this.nota1 = ValorNota;
			break;
		case 2:
			this.nota2 = ValorNota;
			break;
		case 3:
			this.nota3 = ValorNota;
			break;
			default:
				break;
		}
		return ("Alterado/n ");
	}
}
