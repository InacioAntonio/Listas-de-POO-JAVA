package Aplicação;

public class Voo {
	private static int lugares =100;
	private boolean[] lugaresOcupados;
	private int IdVoo;
	private static int UltimoVoo;
	private Data d;
	public Voo(Data d) {
		this.d=d;
		this.UltimoVoo=0;
		this.IdVoo=UltimoVoo+1;
		boolean[] lugaresOcupados = new boolean[100];
		for(int i=0;i<lugaresOcupados.length;i++) {
			lugaresOcupados[i]=false;
		}
	}
	public Voo(Data d,int Id) {
		this.d=d;
		this.UltimoVoo=0;
		this.IdVoo=Id;
		boolean[] lugaresOcupados = new boolean[100];
		for(int i=0;i<lugaresOcupados.length;i++) {
			lugaresOcupados[i]=false;
		}
	}
	public static void CUltimoVoo() {
		UltimoVoo++;
	}
	public int ProximaCadeiraLivre() {
		boolean flag = true;
		int lugar = 0;
		lugaresOcupados = new boolean[100];
		for(int i=0;i<lugaresOcupados.length;i++) {
				if(lugaresOcupados[i]==false) {
					flag = false;
					lugar = i+1;
					break;
				}
		}
		if(!flag) {
			return lugar;
		}else {
			return lugar;
		}
	}
	public boolean verifica(int n) {
		lugaresOcupados = new boolean[100];
		if(lugaresOcupados[n]) {
			return true;
		}else {
			return false;
		}
	}
	public boolean ocupar(int n) {
		lugaresOcupados = new boolean[100];
		if(!lugaresOcupados[n]) {
			lugaresOcupados[n]=true;
			return true;
		}else {
			return false;
		}
	}
	public int[] vagas() {
		lugaresOcupados = new boolean[100];
		int[]  disponiveis= new int[100];
		int j=0;
		for (int i=0;i<lugaresOcupados.length;i++) {
			if(!lugaresOcupados[i]) {
				disponiveis[j]=i+1;
				j++;
			}
		}
		return disponiveis;
	}
	public int GetVoo() {
		return IdVoo;
	}
	public Data getData() {
		return d;
	}
	public void setData(Data d) {
		this.d=d;
	}
	public void setIdVoo(int Id) {
		this.IdVoo=Id;
	}
	public void setLugaresOcupados(boolean[] lugares) {
		lugaresOcupados = new boolean[100];
		this.lugaresOcupados=lugares;
	}
	public Voo Clone() {
		Data copiaData = this.d.Clone();
		lugaresOcupados = new boolean[100];
        boolean[] copiaLugaresOcupados = new boolean[100];
        for (int i = 0; i < this.lugaresOcupados.length; i++) {
            copiaLugaresOcupados[i] = this.lugaresOcupados[i];
        }

        Voo copia = new Voo(copiaData, this.IdVoo);
        copia.setLugaresOcupados(copiaLugaresOcupados);
        return copia;
	}
}
