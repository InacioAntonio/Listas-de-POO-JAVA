package Visão;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import Aplicação.Música;
public class Principal {

	public static void main(String[] args) {
		Scanner Teclado=new Scanner(System.in);
		ArrayList<Música>Playlist=new ArrayList<Música>();
		boolean repete=false,achou=false;;
		int op;
		do {
			System.out.println("1- Adicionar Música");
			System.out.println("2 - Excluir uma Música");
			System.out.println("3 - Tocar uma Música específica(pelo título)");
			System.out.println("4 - Tocar as músicas em sequência");
			System.out.println("6 - Tocar as Músicas embaralhadas(random)");
			System.out.println("7 - Ver as músicas da playlist");
			System.out.println("8 - Sair/n");
			System.out.println("escolha uma dessas opcoes");
			op = Teclado.nextInt();
			switch(op) {
			case 1:
				String auxxnome;
				Música m = new Música();
				System.out.println("Digite o nome da música que gostaria de adicionar");
				auxxnome=Teclado.nextLine();
				m.setNome(auxxnome);
				System.out.println("Digite o nome do Artista da música que gostaria de adicionar ");
				m.setNartista(Teclado.nextLine());
				System.out.println("Digite o tempo de Duração da música que gostaria de adicionar  ");
				m.setDuracao(Teclado.nextInt());
				for(int i=0;i<Playlist.size();i++) {
					if(Playlist.get(i).getNome().equals(auxxnome)) {
						repete=true;
					}
				}
				if(!repete) {
					Playlist.add(m);
				}else {
					System.out.println("Essa musica ja foi adicionada na PlayList");
				}
				
				break;
			case 2:
				System.out.println("Digite a Música que gostaria de Deletar da PlayList ");
				String auxnome = Teclado.nextLine();
				for(int i=0;i<Playlist.size();i++) {
					if(Playlist.get(i).getNome().equals(auxnome)) {
						Playlist.remove(i);
						achou = true;
					}
				}
				if(achou) {
					System.out.println("Musica Removida com Sucesso ");
					
				}else {
					System.out.println("A Musica Digitada não foi achada ");
				}
				break;
			case 3:
				System.out.println("Digite o titulo da Música que gostaria que tocasse ");
				String auxnome2 = Teclado.nextLine();
				achou = false;
				int indice =0;
				for(int i=0;i<Playlist.size();i++) {
					if(Playlist.get(i).getNome().equals(auxnome2)) {
						achou = true;
						indice = i;
					}
				}
				if(achou) {
					Playlist.get(indice).Tocar();
				}else {
					System.out.println("A música Digitada não foi encontrada ");
					
				}
				break;
			case 4:
				String auxartista;
				achou = false;
				System.out.println("Digite o nome do Cantor que gostaria de escutar as musicas ");
				auxartista = Teclado.nextLine();
				for(int i=0;i<Playlist.size();i++) {
					if(Playlist.get(i).getNartista().equals(auxartista)) {
						achou = true;
						Playlist.get(i).Tocar();
					}
				}
				if(!achou) {
					System.out.println("Esse cantor não esta na sua PlayList");
				}
				break;
			case 5:
				for(int i=0;i<Playlist.size();i++) {
					Playlist.get(i).Tocar();
				}
				break;
			case 6:
				Collections.shuffle(Playlist);
				for(Música tocando: Playlist) {
					tocando.Tocar();
				}
				break;
			case 7:
				for(int i=0;i<Playlist.size();i++) {
					System.out.println(Playlist.get(i).getNome());
					System.out.println(Playlist.get(i).getNartista());
					System.out.println(Playlist.get(i).getDuracao());
					
				}
				break;
			case 8:
				System.out.println("Sair/n");
				break;
			}
			
		}while(op!=8);

	}

}
