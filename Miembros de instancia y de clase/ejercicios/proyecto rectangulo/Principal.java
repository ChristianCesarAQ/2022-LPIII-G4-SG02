package ejercicios;

public class Principal {

	public static void main(String[] args) {
		
		//calculo de area
		Coordenada coordenada1 = new Coordenada();
		Coordenada coordenada2 = new Coordenada(4,2);

		Rectangulo rectangulo = new Rectangulo(coordenada1, coordenada2);
		System.out.println(rectangulo.toString());
		
		
		//calculo de area
		System.out.println("Area: " + Manejador.calcularArea(rectangulo) );
		//calculo de perimetro
		System.out.println("perimetro: " + Manejador.calcularPerimetro(rectangulo) );
		
		
		//mover x
		
		rectangulo = Manejador.moverX(2, rectangulo);
		System.out.println("moverX: " + rectangulo.toString());
		//mover y
		rectangulo = Manejador.moverY(2, rectangulo);
		System.out.println("moverY: " + rectangulo.toString());
		
		
		//color
		Rectangulo rectangulo2 = new Rectangulo(coordenada1, coordenada2);
		
		System.out.println("color: " + rectangulo.getColor());
	}

}
