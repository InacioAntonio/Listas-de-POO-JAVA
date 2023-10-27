package Visao;
import Aplicação.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		Reposit A = new Reposit();
		Reposit B = new Reposit();
		Reposit C = new Reposit();
		ArrayList<ClassePessoa> pA = new ArrayList<ClassePessoa>();
		ArrayList<ClassePessoa>pB =  new ArrayList<ClassePessoa>();
		ArrayList<ClassePessoa>pC =  new ArrayList<ClassePessoa>();
		A.setArrayRep(pA);
		A.setArrayRep(pB);
		A.setArrayRep(pC);
		ultilitários u = new ultilitários();
		String cpf;
		String escolha;
		int op = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("1-Cadastrar Pessoa Repo A");
			System.out.println("2-Cadastrar Pessoa Repo B");
			System.out.println("3-Buscar Pessoa Repo");
			System.out.println("4 - Duplicar A em B");
			System.out.println("5 - Gerar a diferença de A e B em C");
			op = teclado.nextInt();
			switch(op) {
			case 1:
				ClassePessoa p = new ClassePessoa();
				System.out.println("Digite o Nome");
				p.setNome(teclado.nextLine());
				teclado.nextLine();
				System.out.println("Digite o CPF da Pessoa");
				p.setCpf(teclado.nextLine());
				A.guarda(p);
				break;
			case 2:
				ClassePessoa p2 = new ClassePessoa();
				System.out.println("Digite o Nome");
				p2.setNome(teclado.nextLine());
				teclado.nextLine();
				System.out.println("Digite o CPF da Pessoa");
				p2.setCpf(teclado.nextLine());
				B.guarda(p2);
				break;
			case 3:
				teclado.nextLine();
				System.out.println("Digite em qual Repositorio que voce quer procurar A ou B ");
				escolha = teclado.nextLine();
				if(escolha=="A") {
					System.out.println("Digite seu CPF");
					cpf = teclado.nextLine();
					ClassePessoa achou= A.recupera(cpf);
					//achou = A.recupera(teclado.nextLine());
					System.out.println(achou.getNome());
					System.out.println(achou.getCPF());
				}else {
					System.out.println("Digite seu CPF");
					cpf = teclado.nextLine();
					ClassePessoa achou = B.recupera(cpf);
					System.out.println(achou.getCPF());
					System.out.println(achou.getNome());
				}
				break;
			case 4:
				u.duplica(A, B);
				for (int i=0;i<pB.size();i++) {
					System.out.println(pB.get(i).getNome());
					System.out.println(pB.get(i).getCPF());
				}
				System.out.println("O de cima era o de B");
				for (int i=0;i<A.getArrayRep().size();i++) {
					System.out.println(pA.get(i).getNome());
					System.out.println(pB.get(i).getCPF());
				}
				break;
			case 5:
				u.diferença(A, B, C);
				for (int i=0;i<pC.size();i++) {
					System.out.println(pC.get(i).getNome());
					System.out.println(pC.get(i).getCPF());
				}
				break;
			case 6:
				System.out.println("Sair");
				default:
					System.out.println("Invalido");
					break;
			}
		}while(op!=6);

	}

}
