package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Cachorro c1= new Cachorro("cachorro sem nome" ,"nehuma raça definida",0);
		System.out.println(c1.getIdade()+c1.getNome()+c1.getRaca());
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do cachorro\n");
		String Name = teclado.nextLine();
		c1.setNome(Name);
		teclado.nextLine();
		System.out.println("Digite a raça do cachorro\n ");
		String Race = teclado.nextLine();
		c1.setRaca(Race);
		System.out.println("Digite a Idade do seu cachorro\n ");
		int age = teclado.nextInt();
		c1.setIdade(age);
		System.out.println(c1.InformarEstado());
		Cachorro c2 = c1.ClonarCachorro();
		System.out.println(c2.InformarEstado());
	}

}
