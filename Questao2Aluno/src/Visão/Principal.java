package Visão;
import Aplicação.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Aluno>registro= new ArrayList<Aluno>();
		String nome;
		int num;
		int i;
		int auxnum,auxnota;
		float no11=0,no12=0,no13=0,nova;
		boolean[] flag = new boolean[3];
		boolean achou = false,achou2 = false;
		Scanner teclado = new Scanner(System.in);
		int op;
		do {
			System.out.println("1 - Cadastrar Alunos\n ");
			System.out.println("2 - Cadastrar Notas\n  ");
			System.out.println("3 - Calcular Medias\n ");
			System.out.println("4 - Informar Situacoes\n");
			System.out.println("5 - Informar Dados de um Aluno\n");
			System.out.println("6 - Alterar Nota\n ");
			System.out.println("7 - Sair\n ");
			System.out.println("Digite a sua opcao\n");
			op = teclado.nextInt();
			switch(op) {
			case 1:
				for(i=0;i<3;i++) {
					teclado.nextLine();
					Aluno a = new Aluno();
					System.out.println("Digite o seu numero de matricula");
					num = teclado.nextInt();
					a.SetMatricula(num);
					teclado.nextLine();
					System.out.println("Digite o seu Nome ");
					nome = teclado.nextLine();
					a.SetNome(nome);
					registro.add(a);
				}
				  flag[0] = true;
				  break;
			case 2:
				if(flag[0]) {
					for(i=0;i<3;i++) {
						System.out.println("Digite a sua nota 1");
						no11 = teclado.nextFloat();
						System.out.println("Digite a sua nota 2");
						no12 = teclado.nextFloat();
						System.out.println("Digite a sua nota 3");
						no13 = teclado.nextFloat();
						registro.get(i).SetNotas(no11, no12, no13);
					}
				flag[1]=true;
				}else {
					System.out.println("Preencha o a opção 1 primeiro ");
				}
				break;
			case 3:
				if(flag[1]) {
					for(i=0;i<3;i++) {
						registro.get(i).CalcularMedia();
					}
					flag[2]=true;
				}else {
					System.out.println("Preencha o case 1 primeiro");
				}
				break;
			case 4:
				if(flag[2]) {
					for(i=0;i<3;i++) {
						System.out.println(registro.get(i).GetSituacao());
					}
				}else {
					System.out.println("Preencha os cases 1 e 2");
				}
					break;
			case 5:
				if(flag[2]) {
					System.out.println("Digite o numero de matricula do aluno que esta pesquisando  ");
					auxnum = teclado.nextInt();
					for(i=0;i<registro.size();i++) {
						if(registro.get(i).GetMatricula() == auxnum) {
							System.out.println("Foi localizado");
							System.out.println(registro.get(i).GetNome());
							System.out.println(registro.get(i).GetMatricula());
							System.out.println(registro.get(i).GetNota1());
							System.out.println(registro.get(i).GetNota2());
							System.out.println(registro.get(i).GetNota3());
							System.out.println(registro.get(i).GetSituacao());
							achou = true;
						}
					}
				}
				if(!achou) {
					System.out.println("Preencha os cases 1 e 2 primeiro");
				}
				break;
			case 6:
				if(flag[1]) {
					System.out.println("Digite o numero de matricula do aluno que esta pesquisando  ");
					auxnum = teclado.nextInt();
					for(i=0;i<registro.size();i++) {
						if(registro.get(i).GetMatricula() == auxnum) {
							System.out.println("Foi localizado");
							System.out.println("Digite qual nota deseja alterar");
							auxnota = teclado.nextInt();
							achou2 = true;
							while(auxnota<0 || auxnota>4) {
								System.out.println("Digite qual nota deseja alterar");
								auxnota = teclado.nextInt();
							}
							System.out.println("Digite a Nova nota");
								nova = teclado.nextFloat();
								registro.get(i).alterarNota(auxnota,nova);
								registro.get(i).CalcularMedia();
								System.out.println(registro.get(i).GetSituacao()); 
						}
						if(!achou2) {
							System.out.println("O número Digitado está Invalido");
						}
					}
				}else {
					System.out.println("Faça a opcao 1 e 2 primeiro/n");
				}
				break;
			case 7:
				System.out.println("Sair/n");
				break;
				default:
					System.out.println("Opcao Invalida/n");
					break;
			}
		}while(op!=7);
		
	}

}
