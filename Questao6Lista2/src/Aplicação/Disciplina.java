package Aplicação;

import java.util.ArrayList;
import Aplicação.Aluno;

public class Disciplina {
	private ArrayList<Aluno> Sala;
	private int Codigo;
	private String Titulo;
	private int CargaH;
	private String NomeP;

	public Disciplina(int Codigo) {
		this.Codigo = Codigo;
		Sala = new ArrayList<Aluno>();
	}

	public String MelhorAluno() {
		float maior = 0;
		int indice = 0;
		for (int i = 0; i < Sala.size(); i++) {
			if (Sala.get(i).Media() > maior) {
				indice = i;
				maior = Sala.get(i).Media();
			}
		}
		return Sala.get(indice).getNome();
	}

	public float media() {
		float soma = 0;
		for (int i = 0; i < Sala.size(); i++) {
			soma = soma + Sala.get(i).Media();
		}
		return soma / Sala.size();
	}

	public void InserirDisciplina(int Codigo, String Titulo, int CargaH, String NomeP) {
		this.Codigo = Codigo;
		this.Titulo = Titulo;
		this.CargaH = CargaH;
		this.NomeP = NomeP;
	}

	public void CadastrarAluno(String Nome, int Matricula, float NotaTrabalho, float Nota1, float Nota2) {
		Aluno aluno = new Aluno(Nome, Matricula, NotaTrabalho, Nota1, Nota2);
		Sala.add(aluno);
	}

	public String ConsultarAluno(int Matricula) {
		boolean achou = false;
		int indice = 0;
		for (int i = 0; i < Sala.size(); i++) {
			if (Sala.get(i).getMatricula() == Matricula) {
				achou = true;
				indice = i;
			}
		}
		if (achou) {
			return ("Nome:" + Sala.get(indice).getNome() + "Matricula:" + Sala.get(indice).getMatricula());
		} else {
			return ("Não Foi encontrado o aluno");
		}
	}

	public String getDados() {
		return ("Titulo: " + Titulo + "Codigo da Disciplina: " + Codigo + "Carga Horaria da Disciplina: " + CargaH
				+ "Docente da Disciplina: " + NomeP);
	}

	public void AlterarProfessor(String NovoP) {
		this.NomeP = NovoP;
	}

	public int getCodigo() {
		return Codigo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public int getCargaH() {
		return CargaH;
	}

	public String getNomeP() {
		return NomeP;
	}

	public void setCodigo(int Codigo) {
		this.Codigo = Codigo;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public void setCargaH(int CargaH) {
		this.CargaH = CargaH;
	}

	public ArrayList<Aluno> getSala() {
		return Sala;
	}
}
