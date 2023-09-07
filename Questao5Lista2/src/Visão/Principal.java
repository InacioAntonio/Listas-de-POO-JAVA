package Visão;
import Aplicação.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
		int op,i,op2,indice=0;
		int auxt;
		boolean[] achou = new boolean[2];
		String auxnome;
		do {
			System.out.println("1 - Cadastrar Pessoa\n");
			System.out.println("2 - Remover Pessoa\n");
			System.out.println("3 - Buscar Pessoa\n ");
			System.out.println("4 - Informar um dado especifico\n");
			System.out.println("Qual opcao deseja ?");
			op = teclado.nextInt();
			switch(op) {
			case 1:
				Pessoa p = new Pessoa();
				teclado.nextLine();
				System.out.println("Digite Seu Nome \n");
				p.setNome(teclado.nextLine());
				System.out.println("Digite Seu Telefone");
				p.setTelefone(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Digite Seu Email");
				p.setEmail(teclado.nextLine());
				agenda.add(p);
				break;
			case 2:
				System.out.println("Digite o Telefone da pessoa que pretende apagar");
				auxt = teclado.nextInt();
				for(i=0;i<agenda.size();i++) {
					if(agenda.get(i).getTelefone()==auxt) {
						achou[0] = true;
						agenda.remove(i);
					}
				}
				if(!achou[0]) {
					System.out.println("Telefone Digitado não encontrado\n");
				}
				if(achou[0]) {
					System.out.println("Foi Apagado da agenda com Sucesso\n");
				}
				break;
			case 3:
				teclado.nextLine();
				System.out.println("Digite o nome de quem Pretende Buscar\n");
				auxnome = teclado.nextLine();
				for(i=0;i<agenda.size();i++) {
					if(agenda.get(i).getNome().equals(auxnome)) {
						achou[1]=true;
						System.out.println("Nome:"+agenda.get(i).getNome());
						System.out.println("Telefone:"+agenda.get(i).getTelefone());
						System.out.println("Email:"+agenda.get(i).getEmail());
					}
				}
				if(!achou[1]) {
					System.out.println("O nome digitado não foi achado\n");
				}
				break;
			case 4:
				System.out.println("Digite o nome da pessoa que esta buscando o dado ");
					auxnome = teclado.nextLine();
					for(i=0;i<agenda.size();i++) {
						if(agenda.get(i).getNome().equals(auxnome)) {
							achou[2]=true;
							indice=i;
						}
					}
					if(achou[2]==true) {
						System.out.println("Digite o dado que voce esta procurando 1-Telefone,2-Email");
							op2 = teclado.nextInt();
							switch(op2) {
							case 1:
								System.out.println("O telefone cadastrado é "+agenda.get(indice).getTelefone());
								break;
							case 2:
								System.out.println("O Email cadastrado é: "+agenda.get(indice).getTelefone());
								break;
								default:
									System.out.println("Opcao Invalida\n");
							}
					}else {
						System.out.println("O nome digitado não achado");
					}
				
					
				break;
				
			}
		}while(op!=5);
	}
}
