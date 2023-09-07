package Visão;
import java.util.Scanner;
import java.util.ArrayList;
import Aplicaçao.Ingresso;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Ingresso>Sala = new ArrayList<Ingresso>();
		Scanner teclado = new Scanner(System.in);
		int op,op2,id=0,age,op3;
		int iz=0;
		boolean[] flag = new boolean[3];
		flag[0]=false;
		do {
			Ingresso i = new Ingresso();
			System.out.println("Qual filme gostaria de ver ?");
			i.setNomeF(teclado.nextLine());
			System.out.println("Qual é o seu Cpf ?");
			i.setCpf(teclado.nextInt());
			System.out.println("Qual a sua Idade ?");
			age = teclado.nextInt();
			if(age>18) { 
				i.setValor(16);
			}else {
				i.setValor(8);
			}
			System.out.println("Qual seria o número do acento ?" );
			op2 = teclado.nextInt();
			for(iz=0;iz<Sala.size();iz++) {
				if(Sala.get(iz).getNPoltrona()== op2) {
					flag[0] = true;
					
				}
			}
			while(op2<0 ||op2>120 ||flag[0]==true){
				
				System.out.println("Essa Poltrona ja esta ocupada ou não existe");
				System.out.println("Qual seria o número do acento ?" );
				op2 = teclado.nextInt();
				for(iz=0;iz<Sala.size();iz++) {
					if(Sala.get(iz).getNPoltrona()== op2) {
						flag[0] = true;
					}
				}
			}
			if(!flag[0]) {
				i.setNpoltrona(op2);
				Sala.add(i);
				i.setId(id);
				do {
					System.out.println("Seu Ingresso já esta cadastrado/n ");
					System.out.println("Deseja alterar sua Posicao (Não Recomendo) se sim digite 1 ou se deseja cancelar o ingresso 2");
					op3 = teclado.nextInt();
					switch(op3) {
					case 1:
						System.out.println("Qual seria o número do acento ?" );
						op2 = teclado.nextInt();
						for(iz=0;iz<Sala.size();iz++) {
							if(Sala.get(iz).getNPoltrona()== op2) {
								flag[0] = true;
								
							}
						}
						while( op2<0 ||op2>120 ||flag[0]==true){
							System.out.println("Essa Poltrona ja esta ocupada ou não existe");
							System.out.println("Qual seria o número do acento ?" );
							op2 = teclado.nextInt();
							for(iz=0;iz<Sala.size();iz++) {
								if(Sala.get(iz).getNPoltrona()== op2) {
									flag[0] = true;
								}
							}
						}
						break;
					case 2:
						Sala.remove(i);
						System.out.println("Seu Ingresso Foi cancelado com Sucesso!\n");
						break;
					case 3:
							System.out.println(i.getId());
							System.out.println(i.getNomeF());
							System.out.println(i.getCpf());
							System.out.println(i.getNPoltrona());
							System.out.println(i.getValor());
							System.out.println("Muito Obrigado pela preferencia!\n");
							break;
					default:
						System.out.println("Opção Invalida\n");
								
					}
				}while(op3!=3 && op3!=2);
			}
			System.out.println("Deseja Comprar mais um Ingresso ? se sim digite 1");
			op = teclado.nextInt();
		}while(op!=0);

	}

}
