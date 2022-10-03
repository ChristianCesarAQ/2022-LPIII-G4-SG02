package ejercicios;

public class PruebaFigura {

	public static void main(String[] args) {
		
		Figura arregloFiguras[] = new Figura[6];
		arregloFiguras[0] = new Circulo(4);
		arregloFiguras[1] = new Cuadrado(3);
		arregloFiguras[2] = new Triangulo(5,6);
		arregloFiguras[3] = new Esfera(6);
		arregloFiguras[4] = new Cubo(6);
		arregloFiguras[5] = new Tetraedro(8);
		
		for(int i = 0; i < 6; i++ ) {
			//para obtener nombre de objeto sin el nombre del paquete
			String nombreObj[] = arregloFiguras[i].getClass().getName().split("\\.");
			
			System.out.println("Objeto " + (i + 1) + ": " + nombreObj[1] + " \ntipo: " + 
		arregloFiguras[i].tipoFigura);
			
			if(arregloFiguras[i].tipoFigura == "bidimensional") {
				System.out.println("Area: " + arregloFiguras[i].obtenerArea());
				System.out.println();
			}
			
			if(arregloFiguras[i].tipoFigura == "tridimensional") {
				System.out.println("Area: " + arregloFiguras[i].obtenerArea());
				
				//conversion descendente
				figuraTridimensional objFiguraTridimensional;
				objFiguraTridimensional = (figuraTridimensional) arregloFiguras[i];
				System.out.println("Volumen: " + objFiguraTridimensional.obtenerVolumen() );
				System.out.println();
			}
		}

	}

}
