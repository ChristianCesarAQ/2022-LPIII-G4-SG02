package ejercicios;

public abstract class figuraTridimensional extends Figura {
	
	//constructor
	public figuraTridimensional() {
		tipoFigura = "tridimensional";
	}
	
	public abstract double obtenerArea();
	
	//funcion adicional para figuras tridimensionales
	public abstract double obtenerVolumen();

}
