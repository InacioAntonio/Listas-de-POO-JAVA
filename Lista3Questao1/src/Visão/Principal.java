package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {
	public static void  main(String[] args) {
		String Operador;
		float operando1,operando2;
		int op=0;
		Scanner teclado = new Scanner(System.in);
		Calculadora c = new Calculadora();
		CalculadoraMelhorada cm= new CalculadoraMelhorada();
		do {
			System.out.println("Digite um número");
			operando1 = teclado.nextFloat();
			System.out.println("Digite outro número");
			operando2 = teclado.nextFloat();
			teclado.nextLine();
			System.out.println("Digite o operador");
			Operador = teclado.nextLine();
			if(!(Operador.equals("^"))) {
				c.setOperando1(operando1);
				c.setOperando2(operando2);
				c.setOperador(Operador);
				System.out.println(c.Calcular());
			}else {
				cm.setOperando1(operando1);
				cm.setOperando2(operando2);
				cm.setOperador(Operador);
				System.out.println(cm.Calcular(1));
				cm.UltimaOperacao();
				System.out.println("A ultima operação foi: "+cm.VerUltimaOperacao());
			}
			System.out.println("Deseja continuar Calculando alguma coisa ? se sim digite 0 se não digite 1 ");
				op = teclado.nextInt();
		}while(op!=1);
	}
	
}
