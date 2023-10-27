package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia;
		int mes;
		int ano,compare;
		System.out.println("Digite um dia Válido ");
		dia = teclado.nextInt();
		System.out.println("Digite um mês Válido");
		mes = teclado.nextInt();
		System.out.println("Digite um ano Válido");
		ano = teclado.nextInt();
		Data d = new Data(dia,mes,ano);
		System.out.println("Digite outra dia Válido ");
		dia = teclado.nextInt();
		System.out.println("Digite outro mes Válido ");
		mes = teclado.nextInt();
		System.out.println("Digite outro ano Válido ");
		ano = teclado.nextInt();
		Data d2= new Data(dia,mes,ano);
		compare =d.Comparar(d2);
		if(compare==0) {
			System.out.println("As datas São Iguais");
		}else {
			if(compare==1) {
				System.out.println("A primeira Data Digitada é a maior");
			}else {
				System.out.println("A segunda Data Digitada é a maior ");
			}
		}
		System.out.println(d.getMesExtenso());
		Data cloned=d.Clone();
		System.out.println(cloned.Getdia());
		System.out.println(cloned.Getmes());
		System.out.println(cloned.Getano());
		Voo v = new Voo(d);
		Voo.CUltimoVoo();
		int livre = v.ProximaCadeiraLivre();
		System.out.println("A proxima Cadeira Livre é "+livre);
		System.out.println("Digite um numero de 0 a 100");
		int n = teclado.nextInt();
		boolean ocupado = v.verifica(n);
		if(ocupado) {
			System.out.println("Lugar está ocupado");
		}else {
			System.out.println("Lugar está Livre ");
		}
		System.out.println("Digite o numero da Cadeira na qual gostaria de Sentar ");
		n = teclado.nextInt();
		ocupado=v.ocupar(n);
		if(ocupado) {
			System.out.println("Operação foi um sucesso agora o lugar é seu");
		}else {
			System.out.println("Infelizmente o Lugar ja foi Ocupado");
		}
		int[] lugar = v.vagas();
		for(int i=0;i<lugar.length;i++) {
			System.out.println("Os Lugares Vagos são :"+lugar[i]);
		}
		Voo clonev= v.Clone();
		System.out.println(clonev.GetVoo());
	}

}
