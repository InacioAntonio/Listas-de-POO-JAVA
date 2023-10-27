package Aplicação;

public class C3 extends C1 implements I1, I2 {
	private int atributoC3;
	public void MetodoC3() {
		System.out.println("Metodo de C3");
	}
	public void inter() {
		System.out.println("Esse metodo e da interface I1");
	}
	public void inter2() {
		System.out.println("Esse metodo e da interface I2");
	}
	public void inter3() {
		System.out.println("Esse metodo e da interface I3");
	}
	public void MetodoC2() {
		System.out.println("SobrePosição do metodo de C2");
	}

}
