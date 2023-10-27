package Aplicação;

public class Casa {
	 private String Cor;
	 private Porta porta1;
	 private Porta porta2;
	 private Porta porta3;
	 public Casa(Porta p1,Porta p2, Porta p3) {
		 this.porta1=p1;
		 this.porta2=p2;
		 this.porta2=p3;
	 }
	 public Casa(Porta p1,Porta p2, Porta p3, String Cor) {
		 this.Cor=Cor;
		 this.porta1=p1;
		 this.porta2=p2;
		 this.porta3=p3;
	 }
	 public Casa() {
		 
	 }
	 public int TotaldePortas() {
		 return 3;
	 }
	 public int TotaldePortasAbertas() {
		 int cont =0;
		 if(porta1.estaAberta()) {
			 cont++;
		 }
		 if(porta2.estaAberta() && porta1.estaAberta()) {
			 cont+=2;
		 }
		 if(porta3.estaAberta()&& porta1.estaAberta() && porta2.estaAberta()) {
			 cont+=3;
		 }
		 if(!porta1.estaAberta()&& !porta2.estaAberta() && !porta3.estaAberta()) {
			 cont =0;
		 }
		 return cont;
	 }
	 public Porta getPorta1() {
		 return porta1;
	 }
	 public Porta getPorta2() {
		 return porta2;
	 }
	 public Porta getPorta3() {
		 return porta3;
	 }
	 public void Pintar(String Cor) {
		 this.Cor=Cor;
	 }
	 
}
