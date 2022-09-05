package ACTIVIDADES;

public class ContadorTest2 {

	public static void main(String[] args) {
		Contador c1, c2;
		
		System.out.println(Contador.acumulador());
		c1 = new Contador();
		c2 = new Contador();
		c1.inc();
		c1.inc();
		c2.inc();
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(Contador.acumulador());
	}

}
