package ejercicios;

public class Manejador {
	public static double calcularArea(Rectangulo rectangulo){
		
		//representa la esquina izquierda superior
		Coordenada coordenada3 = new Coordenada(rectangulo.getEsquina1().getX(), rectangulo.getEsquina2().getY());
		//representa esquina inferior derecha
		Coordenada coordenada4 = new Coordenada(rectangulo.getEsquina2().getX(), rectangulo.getEsquina1().getY());
	    
		double altura = Coordenada.distancia(rectangulo.getEsquina1(), coordenada3);
		double base = Coordenada.distancia(rectangulo.getEsquina1(), coordenada4);
	
		return base * altura;
	
	}
	
	
	public static double calcularPerimetro(Rectangulo rectangulo) {
		
		//representa la esquina izquierda superior
		Coordenada coordenada3 = new Coordenada(rectangulo.getEsquina1().getX(), rectangulo.getEsquina2().getY());
		//representa esquina inferior derecha
		Coordenada corrdena4 = new Coordenada(rectangulo.getEsquina2().getX(), rectangulo.getEsquina1().getY());
			    
		double altura = Coordenada.distancia(rectangulo.getEsquina1(), coordenada3);
		double base = Coordenada.distancia(rectangulo.getEsquina1(), corrdena4);
		
		return 2 * (base + altura);
		
	}
	
	public static Rectangulo moverX(int x, Rectangulo rectangulo) {
		rectangulo.setEsquina1(new Coordenada(rectangulo.getEsquina1().getX() + x, rectangulo.getEsquina1().getY()));
		rectangulo.setEsquina2(new Coordenada(rectangulo.getEsquina2().getX() + x, rectangulo.getEsquina2().getY()));
		return rectangulo;
	}
	
    public static Rectangulo moverY(int y, Rectangulo rectangulo) {
    	rectangulo.setEsquina1(new Coordenada(rectangulo.getEsquina1().getX() , rectangulo.getEsquina1().getY() + y));
		rectangulo.setEsquina2(new Coordenada(rectangulo.getEsquina2().getX() , rectangulo.getEsquina2().getY() + y));
		return rectangulo;
	}
	
}
