package Visão;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		ArrayList<Integer> arrayC = new ArrayList<Integer>();
		int[] A = new int[3];
		int[] B = new int[3];
		int i,soma=0,op;
		for(i=0;i<3;i++) {
			System.out.println("Digite um número para o vetor A");
			A[i] = teclado.nextInt();
			System.out.println("Digite um número para o vetor B");
			B[i] = teclado.nextInt();
		}
		for(i=0;i<3;i++) {
			soma = soma + A[i];
		}
		int[] C = new int[3];
		for(i=0;i<3;i++) {
			C[i] = A[i]+B[i];
		}
		do {
			System.out.println("Digite um numero para o array A");
			array.add(teclado.nextInt());
			System.out.println("Digite um numero para o array B");
			arrayB.add(teclado.nextInt());
			System.out.println("Deseja adicionar mais um numero ? se sim digite 0");
			op = teclado.nextInt();
			
		}while(op != 1);
		for(i=0;i<array.size();i++) {
			arrayC.add(array.get(i)+arrayB.get(i));
		}
		for(i=0;i<arrayC.size();i++) {
			System.out.println(arrayC.get(i));
		}
		
	}

}
