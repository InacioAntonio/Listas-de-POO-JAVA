package Visão;
import Aplicação.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		String Nome,Endereço;
		int Telefone;
		float ValorCredito,ValorDivida;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu Nome");
		Nome = teclado.nextLine();
		teclado.nextLine();
		System.out.println("Digite o seu Endereço");
		Endereço = teclado.nextLine();
		System.out.println("Digite o telefone ");
		Telefone = teclado.nextInt();
		System.out.println("Digite o Credito Maximo do Fornecedor");
		ValorCredito = teclado.nextFloat();
		System.out.println("Digite o Montante da sua Dívida ");
		ValorDivida= teclado.nextFloat();
		Fornecedor f = new Fornecedor();
		f.setNome(Nome);
		f.setEndereço(Endereço);
		f.setTelefone(Telefone);
		f.SetValorCredito(ValorCredito);
		f.setValorDivida(ValorDivida);
		System.out.println(f.getEndereço());
		System.out.println(f.getNome());
		float saldo = f.ObterSaldo();
		System.out.println(f.getValorCredito());
		System.out.println(f.getValorDivida());
		System.out.println(saldo);
	}

}
