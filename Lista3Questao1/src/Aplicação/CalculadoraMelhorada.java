package Aplicação;

public class CalculadoraMelhorada extends Calculadora {
	private  String memoria;
	public CalculadoraMelhorada() {
		this.memoria="Vazio";
	}
	private float Potencia() {
		float resultado=1;
		for(int i=0;i<getOperando2();i++) {
			resultado*=getOperando1();
		}
		return resultado;
	}
	public float Calcular(float resultado) {
		if(getOperador().equals("^")) {
			resultado = Potencia();
			return resultado;
		}else {
			return 0;
		}
	}
	public  String VerUltimaOperacao() {
		return memoria;
	}
	public  void UltimaOperacao() {
		memoria=getOperador();
	}
}
