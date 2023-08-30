package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		String nome,nome2,nome3;
		int num;
		int num2;
		int num3;
		int auxnum,auxnota;
		float no11=0,no12=0,no13=0,no21=0,no22=0,no23=0,no31=0,no32=0,no33=0,nova;
		boolean[] flag = new boolean[3];
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
				teclado.nextLine();
				System.out.println("Digite o nome do aluno ");
				  nome = teclado.nextLine();
				  a1.SetNome(nome);
				  System.out.println("Digite o nome do aluno ");
				  nome2 = teclado.nextLine();
				  a2.SetNome(nome2);
				  System.out.println("Digite o nome do aluno ");
				  nome3 = teclado.nextLine();
				  a3.SetNome(nome3);
				  System.out.println("Digite o numero de matricula do aluno  ");
				  num = teclado.nextInt();
				  a1.SetMatricula(num);
				  System.out.println("Digite o numero de matricula do aluno  ");
				  num2 = teclado.nextInt();
				  a2.SetMatricula(num2);
				  System.out.println("Digite o número de matricula do aluno ");
				  num3 = teclado.nextInt();
				  a3.SetMatricula(num3);
				  flag[0] = true;
				  break;
			case 2:
				if(flag[0]) {
					System.out.println("Digite a nota1 do primeiro aluno");
					no11 = teclado.nextFloat();
				System.out.println("Digite a nota2 do primeiro aluno ");
					no12 = teclado.nextFloat();
				System.out.println("Digite a nota3 do primeiro aluno");
				    no13 = teclado.nextFloat();
				  a1.SetNotas(no11, no12, no13);
				System.out.println("Digite a nota1  do Segundo aluno" );
				  no21 = teclado.nextFloat();
				System.out.println("Digite a nota2 do Segundo aluno ");
				  no22 = teclado.nextFloat();
				System.out.println("Digite a nota3 do Segundo aluno ");
				  no23 = teclado.nextFloat();
				a2.SetNotas(no21, no22, no23);
				System.out.println("Digite a nota1 do Terceiro aluno ");
					no31 = teclado.nextFloat();
				System.out.println("Digite a nota2 do Terceiro aluno/n ");
				  	no32 = teclado.nextFloat();
				System.out.println("Digite a nota3 do Terceiro aluno/n ");
				 	no33 = teclado.nextFloat();
				a3.SetNotas(no31, no32, no33);
				flag[1]=true;
				}else {
					System.out.println("Preencha o a opção 1 primeiro ");
				}
				break;
			case 3:
				if(flag[1]) {
					a1.CalcularMedia();
					a2.CalcularMedia();
					a3.CalcularMedia();
					flag[2]=true;
				}else {
					System.out.println("Preencha o case 1 primeiro");
				}
				break;
			case 4:
				if(flag[2]) {
					System.out.println(a1.GetSituacao());
					System.out.println(a2.GetSituacao());
					System.out.println(a3.GetSituacao());
				}else {
					System.out.println("Preencha os cases 1 e 2");
				}
					break;
			case 5:
				if(flag[2]) {
					System.out.println("Digite o numero de matricula do aluno que esta pesquisando  ");
					auxnum = teclado.nextInt();
					if(a1.BuscarAluno(auxnum)) {
						System.out.println(a1.GetNome()); 
						System.out.println(a1.GetMatricula()); 
						System.out.println(a1.GetMedia());
						System.out.println(a1.GetNota1());
						System.out.println(a1.GetNota2());
						System.out.println(a1.GetNota3());
						System.out.println(a1.GetSituacao());
					}else {
						if(a2.BuscarAluno(auxnum)) {
							System.out.println(a2.GetNome()); 
							System.out.println(a2.GetMatricula()); 
							System.out.println(a2.GetMedia());
							System.out.println(a2.GetNota1());
							System.out.println(a2.GetNota2());
							System.out.println(a2.GetNota3());
							System.out.println(a2.GetSituacao());
						}else {
							if(a3.BuscarAluno(auxnum)) {
								System.out.println(a3.GetNome()); 
								System.out.println(a3.GetMatricula()); 
								System.out.println(a3.GetMedia());
								System.out.println(a3.GetNota1());
								System.out.println(a3.GetNota2());
								System.out.println(a3.GetNota3());
								System.out.println(a3.GetSituacao());
							}else {
								System.out.println("Não foi achado o aluno");
								}
							}
						}
				}else {
					System.out.println("Preencha os cases 1 e 2 primeiro");
				}
				
				break;
			case 6:
				if(flag[1]) {
					System.out.println("Digite o numero de matricula do aluno que esta pesquisando  ");
					auxnum = teclado.nextInt();
					if(a1.BuscarAluno(auxnum)) {
						System.out.println("Qual Nota deseja alterar ");
						 auxnota = teclado.nextInt();
						 System.out.println("Qual é a nova nota ");
						 nova = teclado.nextFloat();
						 a1.alterarNota(auxnota,nova);
							 a1.CalcularMedia();
							 if(a1.GetMedia()>=7) {
									System.out.println("O aluno 1 esta Aprovado\n ");
							}else {
								if(a1.GetMedia()<3) {
									System.out.println("O aluno 1 esta Reprovado\n ");
								}else {
									System.out.println("O aluno 1 esta em Recuperacao\n");
									}
							   }
					}else {
						if(a2.BuscarAluno(auxnum)) {
							System.out.println("Qual Nota deseja alterar ");
							 auxnota = teclado.nextInt();
							 System.out.println("Qual é a nova nota ");
							 nova = teclado.nextFloat();
							 a2.alterarNota(auxnota,nova);
								 a2.CalcularMedia();
								if(a2.GetMedia()>=7) {
									System.out.println("O aluno 2 esta Aprovado\n ");
							}else {
								if(a2.GetMedia()<3) {
									System.out.println("O aluno 2 esta Reprovado\n ");
								}else {
									System.out.println("O aluno 2 esta em Recuperacao\n");
								}
							   }
						}else {
							if(a3.BuscarAluno(auxnum)) {
								System.out.println("Digite a nota que deseja alterar /n");
								auxnota = teclado.nextInt();
								 System.out.println("Qual é a nova nota ");
								 nova = teclado.nextFloat();
								 a3.alterarNota(auxnota,nova);
									if(a3.GetMedia()>=7) {
										System.out.println("O aluno 3 esta Aprovado\n ");
								}else {
									if(a3.GetMedia()<3) {
										System.out.println("O aluno 3 esta Reprovado\n ");
									}else {
										System.out.println("O aluno 3 esta em Recuperacao\n");
										}
								  	}
							}else {
								System.out.println("Nenhum aluno foi encontrado/n");
							}
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
