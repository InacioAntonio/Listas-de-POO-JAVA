package Visão;

import java.util.ArrayList;
import java.util.Scanner;
import Aplicação.Aluno;
import Aplicação.Disciplina;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cod = 01, op, carga, auxmat, mat;
		float not1, nott, not2;
		String materia, nome, nomeA;
		Disciplina d = new Disciplina(cod);
		ArrayList<Aluno> Sala = d.getSala();
		
		boolean flag = false;
		do {
			System.out.println("1 - Inserir Disciplina ");
			System.out.println("2 - Retornar Dados da disciplina");
			System.out.println("3 - Inserir Alunos ");
			System.out.println("4 - Alterar o Professor ");
			System.out.println("5 - Media dos Alunos na Disciplina");
			System.out.println("6 - Melhor Aluno Da Disciplina");
			System.out.println("7 - Consultar Alunos ");
			op = teclado.nextInt();
			switch (op) {
			case 1:
				teclado.nextLine();
				System.out.println("Digite o Nome da Disciplina ");
				materia = teclado.nextLine();
				System.out.println("Digite a Carga Horaria da Disciplina");
				carga = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Digite o nome do Professor da Disciplina ");
				nome = teclado.nextLine();
				d.InserirDisciplina(cod, materia, carga, nome);
				cod++;
				break;
			case 2:
				System.out.println(d.getDados());
				break;
			case 3:
				teclado.nextLine();
				System.out.println("Digite o Nome do Aluno ");
				nomeA = teclado.nextLine();
				System.out.println("Digite o número de Matricula ");
				// teclado.nextLine();
				mat = teclado.nextInt();
				System.out.println("Digite a Nota do Trabalho ");
				nott = teclado.nextFloat();
				System.out.println("Digite a nota da prova 1");
				not1 = teclado.nextFloat();
				System.out.println("Digite a nota da prova 2");
				not2 = teclado.nextFloat();
				d.CadastrarAluno(nomeA, mat, not1, nott, not2);
				break;
			case 4:
				System.out.println("Qual seria o nome do Novo professor ");
				d.AlterarProfessor(teclado.nextLine());
				break;
			case 5:
				System.out.println("A média dos Alunos Nessa Disciplina foi de: " + d.media());
				break;
			case 6:
				System.out.println("O melhor aluno nessa Disciplina foi: " + d.MelhorAluno());
				break;
			case 7:
				System.out.println("Digite o numero de matricula do aluno no qual está procurando ");
				auxmat = teclado.nextInt();
				System.out.println(d.ConsultarAluno(auxmat));
				break;
			case 8:
				System.out.println("Sair/n");
				break;
			default:
				System.out.println("Opcao Invalida \n");
				break;
			}
		} while (op != 8);

	}

}
