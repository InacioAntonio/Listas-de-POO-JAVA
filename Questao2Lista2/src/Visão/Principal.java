package Visão;

import java.util.Scanner;
import java.util.ArrayList;
import Aplicação.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pedido> registro = new ArrayList<Pedido>();
		Scanner teclado = new Scanner(System.in);
		int op, op2;
		int f, n = 0, i, auxid;
		boolean achou = false, achou2 = false, achou3 = false;
		do {
			System.out.println(" 1-Deseja fazer o pedido ? /n");
			System.out.println(" 2-Confirmar entregar ");
			System.out.println(" 3 -Ver pedidos confirmados/n");
			System.out.println(" 4- Ver pedidos entregues /n");
			System.out.println(" 5- Sair/n");
			System.out.println("Qual opcao deseja ?");
			op = teclado.nextInt();
			switch (op) {
			case 1:
				Pedido p = new Pedido();
				do {
					teclado.nextLine();
					System.out.println("Digite o endereco da compra");
					p.setendereco(teclado.nextLine());
					System.out.println("Digite a Hora da compra ");
					p.sethora(teclado.nextInt());
					System.out.println(p.getendereco() + p.gethora());
					System.out.println("Os dados estão certos ? se sim digite 1 se nao digite 0");
					op2 = teclado.nextInt();
				} while (op2 != 1);
				System.out.println("Quantidade que deseja de botijoes ?");
				p.setqtd(teclado.nextInt());
				p.calc();
				p.Tentrega();
				System.out.println("O tempo de entrega é " + p.gettempo());
				System.out.println(
						"Qual seria a forma de pagamento dinheiro ou cartao ? 1 para cartao e 2 para dinheiro");
				f = teclado.nextInt();
				if (f == 1) {
					teclado.nextLine();
					System.out.println("Digite o numero do seu Cartão/n");
					p.setpagamento(teclado.nextLine());
					p.setStatus("Confirmado");
					p.setId(n);
					registro.add(p);
				} else {
					p.setpagamento("Dinheiro");
					p.setStatus("Confirmado");
					p.setId(n);
					registro.add(p);
				}
				break;
			case 2:
				System.out.println("Digite o Id do pedido ");
				auxid = teclado.nextInt();
				for (i = 0; i < registro.size(); i++) {
					if (registro.get(i).getId() == auxid) {
						achou = true;
						registro.get(i).setStatus("Entregue");
					}
				}
				if (!achou) {
					System.out.println("Não foi Localizado/n");
				}
				break;
			case 3:
				for (i = 0; i < registro.size(); i++) {
					if (registro.get(i).getstatus().equals("Confirmado")) {
						achou2 = true;
						System.out.println(registro.get(i).getId());
						System.out.println(registro.get(i).gethora());
						System.out.println(registro.get(i).getendereco());
						System.out.println(registro.get(i).getqtd());
						System.out.println(registro.get(i).gettempo());
						System.out.println(registro.get(i).gettotal());

					}
				}
				if (!achou2) {
					System.out.println("Não foi achado nada !");
				}
				break;
			case 4:
				for (i = 0; i < registro.size(); i++) {
					if (registro.get(i).getstatus().equals("Entregue")) {
						achou3 = true;
						System.out.println(registro.get(i).getId());
						System.out.println(registro.get(i).gethora());
						System.out.println(registro.get(i).getendereco());
						System.out.println(registro.get(i).getqtd());
						System.out.println(registro.get(i).gettotal());
					}
				}
				if (!achou3) {
					System.out.println("Nenhum pedido foi entregue/n");
				}
				break;
			default:
				System.out.println("Opcao Invalida/n");
				break;
			}

		} while (op != 5);

	}
}
