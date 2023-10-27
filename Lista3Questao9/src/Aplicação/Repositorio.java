package Aplicação;

public interface Repositorio {
	public void guarda (ClassePessoa nova); 
	ClassePessoa recupera(String cpf); 
	public ClassePessoa primeiro();
	 public ClassePessoa proximo(); 
}
