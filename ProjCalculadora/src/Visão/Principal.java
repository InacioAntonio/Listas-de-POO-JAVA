package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double num1,num2,resultado=0;
		Calculadora c = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("1- PARA SOMAR");
			System.out.println("2 - PARA SUBTRAIR");
			System.out.println("3 - PARA MULTIPLICAR");
			System.out.println("4 - PARA DIVIDIR");
			System.out.println("5 - SAIR");
				try {
					teclado.next();
					System.out.println("Digite sua opção");
						op = teclado.nextInt();
						
				}catch (java.util.InputMismatchException e){
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um inteiro");
					
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um inteiro");
				} catch (Exception e) {
					System.out.println(e);
				}
			switch (op) {
			case 1:
				try {
					System.out.println("Digite um número");
					num1 = teclado.nextDouble();
					c.setNum1(num1);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número ");
				}catch (Exception e) {
					System.out.println(e);
				}
			try {
				System.out.println("Digite outro número");
				num2 = teclado.nextDouble();
				c.setNum2(num2);
			}catch (NumberFormatException e) {
				System.out.println(e);
				System.out.println("Tentou digitar algo diferente de um número");
			}catch (Exception e) {
				System.out.println(e);
			}
			resultado = c.somar();
			System.out.println(resultado);
				break;
			case 2:
				try {
					System.out.println("Digite um número");
					num1 = teclado.nextDouble();
					c.setNum1(num1);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número ");
				}catch (Exception e) {
					System.out.println(e);
				}
				try {
					System.out.println("Digite outro número");
					num2 = teclado.nextDouble();
					c.setNum2(num2);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número");
				}catch (Exception e) {
					System.out.println(e);
				}
				resultado = c.subtrair();
				System.out.println(resultado);
				break;
			case 3:
				try {
					System.out.println("Digite um número");
					num1 = teclado.nextDouble();
					c.setNum1(num1);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número ");
				}catch (Exception e) {
					System.out.println(e);
				}
				try {
					System.out.println("Digite outro número");
					num2 = teclado.nextDouble();
					c.setNum2(num2);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número");
				}catch (Exception e) {
					System.out.println(e);
				}
				resultado = c.multiplicar();
				break;
			case 4:
				try {
					System.out.println("Digite um número");
					num1 = teclado.nextDouble();
					c.setNum1(num1);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número ");
				}catch (Exception e) {
					System.out.println(e);
				}
				try {
					System.out.println("Digite outro número");
					num2 = teclado.nextDouble();
					c.setNum2(num2);
				}catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Tentou digitar algo diferente de um número");
				}catch (Exception e) {
					System.out.println(e);
				}
				try {
					resultado = c.dividir();
				}catch (ArithmeticException e ) {
					System.out.println(e);
					System.out.println("Tentou dividir por 0 ");
				}catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(resultado);
				break;
			case 5:
				System.out.println("Sair");
				break;
			case 6:
				System.out.println("Opção Invalida");
				break;
			}
			
		}while (op!=5);

	}

}
