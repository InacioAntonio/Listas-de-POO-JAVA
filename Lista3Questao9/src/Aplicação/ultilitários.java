package Aplicação;
import java.util.ArrayList;

public class ultilitários {
	public void duplica(Reposit A,Reposit B) {
		for (int i=0;i<A.getArrayRep().size();i++) {
			B.getArrayRep().add(A.getArrayRep().get(i));
		}
	
	}
	public void diferença(Reposit A,Reposit B, Reposit C) {
		ArrayList<ClassePessoa> pA = new ArrayList<ClassePessoa>();
		ArrayList<ClassePessoa> pB = new ArrayList<ClassePessoa>();
		pA = A.getArrayRep();
		pB = B.getArrayRep();
		boolean flag;
		for (int i=0;i<pA.size();i++) {
			flag = false;
			for (int j=0;j<pB.size();i++) {
				if(  pA.get(i).equals(pB.get(i))) {
					flag = true;
					break;
				}
			
			}
			if(!flag) {
				C.getArrayRep().add(A.getArrayRep().get(i));// poderia usar o Contains tbm
			}
		}
	}
}
