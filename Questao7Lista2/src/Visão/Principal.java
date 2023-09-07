package Visão;
import Aplicação.País;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op,op2,op3,rep=0,posi=0;
		float tam;
		String nome,capital,auxcapital,auxnome,nomeF;
		boolean flag=false,repete=false,achou=false;
		ArrayList<País>Mundo=new ArrayList<País>();
		ArrayList<País> front=new ArrayList<País>();
		ArrayList<País> vizinhos=new ArrayList<País>();
		do {
			System.out.println("1 - Cadastrar Pais");
			System.out.println("2 - Adicionar Paises que fazem fronteira com o criado");
			System.out.println("3 - Ver dados do Pais");
			System.out.println("4 - Lista de Paises que fazem fronteira com o pais");
			System.out.println("5 - Retorna a Lista de Vizinhos entre 2 paises");
			System.out.println("6 - Sair\n");
			op = teclado.nextInt();
			switch(op) {
			case 1:
				do {
					teclado.nextLine();
					System.out.println("Digite o nome do pais ?");
					nome = teclado.nextLine();
					System.out.println("Digite o nome da Capital do seu Pais");
					capital = teclado.nextLine();
					teclado.nextLine();
					System.out.println("Digite a Dimensao do Pais em KM2");
					tam = teclado.nextFloat();
					País p = new País(nome,tam,capital);
					Mundo.add(p);
					p.AdicionarPaisF(front);
					for(int i=0;i<Mundo.size();i++) {
						if(p.Equals(Mundo.get(i))) {
							rep++;
						}
					}
					if(rep>1) {
						System.out.println("Esse país ja foi digitado Digite outro");
					}
				}while(rep>1);
				break;
			case 2:
				System.out.println("Seu país tem fronteiras com outros digite 1 se sim digite 2 se não");
				op3 = teclado.nextInt();
				switch(op3) {
				case 1:
					teclado.nextLine();
					
					do {
						System.out.println("Digite o país que faz fronteira com o seu ");
						nome= teclado.nextLine();
						teclado.nextLine();
						System.out.println("Digite o nome da Capital desse pais ");
						capital = teclado.nextLine();
						System.out.println("Digite a Dimensao desse pais ");
						tam = teclado.nextFloat();
						País pt = new País(nome,tam,capital);
						for(int i=0;i<front.size();i++) {
							if(front.get(i).getNome().equals(nome)) {
								repete=true;
							}
						}
						if(!repete) {
							front.add(pt);
							Mundo.add(pt);
							
						}
						
					}while(repete);
					break;
				case 2:
					System.out.println("Cadastro Finalizado");
					break;
					default:
						System.out.println("Opcao Invalida\n");
						break;
				}
				break;
			case 3:
				System.out.println("Nome : "+Mundo.get(0).getNome());
				System.out.println("Capital:"+Mundo.get(0).getCapital());
				System.out.println("Dimensão:"+Mundo.get(0).getDimensao());
				break;
			case 4:
				for(int i=0;i<front.size();i++) {
					System.out.println(front.get(i).getNome());
				}
				break;
			case 5:
				teclado.nextLine();
				System.out.println("Digite o nome do país que quer saber a fronteira em comum ");
				auxnome = teclado.nextLine();
				for(int i=0; i<Mundo.size();i++) {
					if(Mundo.get(i).getNome().equals(auxnome)) {
						 achou = true;
						 posi = i;
					}
				}
				if(achou) {
					vizinhos = Mundo.get(0).VizinhosComuns(Mundo.get(posi));
					for(int i=0;i<vizinhos.size();i++) {
						System.out.println(vizinhos.get(i).getNome());
					}
				}
				break;
			case 6:
				System.out.println("Sair/n");
				break;
				default:
					System.out.println("Opcao Invalida/n");
					break;
			}
		}while(op!=6);

	}

}
