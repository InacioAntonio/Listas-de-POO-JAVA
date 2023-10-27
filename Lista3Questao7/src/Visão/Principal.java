package Visão;
import Aplicação.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Porta p = new Porta();
		Edificio e = new Edificio();
		ArrayList<Porta>qtdp = new ArrayList<>();
		System.out.println("Escreva  uma cor para porta ");
		p.Pinta(teclado.nextLine());
		System.out.println("Deseja abrir a porta digite 1 se sim");
		if(teclado.nextInt()==1) {
			p.Abre();
		}else {
			System.out.println("A porta está fechada ");
		}
		System.out.println("Digite a dimensão X da porta");
		p.setDimensaoX(teclado.nextFloat());
		System.out.println("Digite a dimensão Y da porta ");
		p.setDimensaoY(teclado.nextFloat());
		System.out.println("Digite a dimensão Z da porta ");
		p.setDimensaoZ(teclado.nextFloat());
		System.out.println(p.getdimensaoX());
		System.out.println(p.getCor());
		System.out.println(p.getDimensaoZ());
		System.out.println(p.getDimensaoY());
		if(p.estaAberta()) {
			System.out.println("A porta está aberta");
		}else {
			System.out.println("A porta está fechada ");
		}
		System.out.println("Digite a cor do seu Edificio");
		teclado.nextLine();
		e.Pintar(teclado.nextLine());
		Porta p2 = new Porta("Vermelho",10,10,10);
		Porta p3 = new Porta("Azul",10,20,30);
		Porta p4 = new Porta("Verde-Agua",10,40,50);
		Porta p5 = new Porta("Verde",10,15,15);
		e.setArrayPorta(qtdp);
		e.AdicionaPorta(p3);
		System.out.println(e.getTotalPortas());
		
	}

}
