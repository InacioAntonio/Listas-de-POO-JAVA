package Visão;
import java.util.Scanner;
import Aplicação.*;
public class Principal {
	public static void main(String[] args) {
		int dia,mes,ano,fumantes,qtdlugares;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um dia");
		dia = teclado.nextInt();
		System.out.println("Digite um mês");
		mes = teclado.nextInt();
		System.out.println("Digite um ano");
		ano = teclado.nextInt();
		Data d = new Data(dia,mes,ano);
		System.out.println("Digite a quantidade de Lugares desse voo");
		qtdlugares = teclado.nextInt();
		System.out.println("Digite a quantidade de lugares Reservados para fumantes nesse voo");
		fumantes = teclado.nextInt();
		while(fumantes>qtdlugares) {
			System.out.println("Digite novamente a quantidade de lugares Reservados para fumantes nesse voo");
			fumantes = teclado.nextInt();
		}
		VooMarcado vm = new VooMarcado(d,fumantes,qtdlugares);
		System.out.println("Digite o número da cadeira ");
		int n = teclado.nextInt();
		vm.CadeirasF(fumantes);
		
		String r = vm.Tipo(n);
		if(r=="F") {
			System.out.println("Cadeira para Fumantes");
		}else {
			System.out.println("Cadeira para não Fumantes");
		}
	}
}
