package Aplicação;

public class Calculadora {
	private String operador;
	private float operando1;
	private float operando2;
	public Calculadora() {
		this.operando1=0;
		this.operando2=0;
	}
	public float Calcular() {
		float resultado;
		if(this.operador.equals("-")) {
			resultado = subtração();
			return resultado;
		}else {
			if(this.operador.equals("+")) {
				resultado=soma();
				return resultado;
			}else {
				if(this.operador.equals("*")) {
					resultado=multiplicar();
					return resultado;
				}else {
					if(this.operador.equals("/")) {
						resultado=dividir();
						return resultado;
					}else {
						return 0;
					}
				}
			}
		}
	}
	private float subtração() {
		return operando1-operando2;
	}
	private float soma() {
		return operando1+operando2;
	}
	private float multiplicar() {
		return operando1*operando2;
	}
	private float dividir() {
		return operando1/operando2;
	}
	public String getOperador() {
		return operador;
	}
	public float getOperando1() {
		return operando1;
	}
	public float getOperando2() {
		return operando2;
	}
	public void setOperando1(float operando1) {
		this.operando1=operando1;
	}
	public void setOperando2(float operando2) {
		this.operando2=operando2;
	}
	public void setOperador(String operador) {
		this.operador=operador;
	}
}
