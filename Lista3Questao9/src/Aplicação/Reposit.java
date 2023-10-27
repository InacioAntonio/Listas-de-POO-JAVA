package Aplicação;
import java.util.*;
public class Reposit implements Repositorio {
	private ArrayList<ClassePessoa> repo;
	private int indice;
	public Reposit() {
	this.repo = new ArrayList<ClassePessoa>();
	this.indice=0;
	}
	public void guarda(ClassePessoa nova) {
	 repo.add(nova);
	}
	public ClassePessoa recupera(String CPF) {
		boolean flag = false;
		int indice = 0;
		//ArrayList<ClassePessoa>copia = repo;
		for (int i=0;i<repo.size();i++) {
			if(repo.get(i).getCPF().equals(CPF)) {
				flag = true;
				indice=i;
				break;
			}
		}
		if(flag) {
			System.out.println("flag");
			ClassePessoa p = repo.get(indice);
			return p;
		}else {
			return null;
		}
	}
	public ClassePessoa primeiro() {
		return repo.get(0);
	}
	public ClassePessoa proximo() {
		indice++;
		ClassePessoa p = repo.get(indice);
		return p;
	}
	public void setArrayRep(ArrayList<ClassePessoa> re) {
		this.repo=re;
	}
	public ArrayList<ClassePessoa> getArrayRep() {
		return repo;
	}
}
