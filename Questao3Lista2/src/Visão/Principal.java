package Visão;
import java.util.Scanner;
import java.util.ArrayList;
import Aplicação.Robo;
public class Principal {

	public static void main(String[] args) {
		Robo r1 = new Robo();
		Scanner teclado = new Scanner(System.in);
		int[][] Sala = new int[20][40];
		int[] posi = new int[1];
		posi = r1.MostrarPosicaoAtual();
		int op,i,j;
		do {
			for(i=0;i<Sala.length;i++) {
				for(j=0;j<Sala[i].length;j++) {
					if(i==0 && j ==0) {
						Sala[i][0] = r1.getLinha();
						Sala[0][j] = r1.getColuna();
					}
				System.out.println(Sala[i][j]);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				}
				
			}
			System.out.println("1 - Andar para frente\n ");
			System.out.println("2 - Andar para trás\n");
			System.out.println("3 - Andar para direita\n");
			System.out.println("4 - Andar para esquerda\n");
			System.out.println("Digite uma dessas opcoes");
			op = teclado.nextInt();
			switch(op) {
			case 1:
				r1.AndarPraFrente();
				break;
			case 2:
				r1.AndarTras();
				break;
			case 3:
				r1.AndarDireita();
				break;
			case 4:
				r1.AndarEsquerda();
				break;
				default:
					System.out.println("Opcao Invalida \n");
					break;
			}
		}while(op!=5);
		

	}

}
