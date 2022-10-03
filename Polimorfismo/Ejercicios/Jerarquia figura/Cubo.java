package ejercicios;

public class Cubo extends figuraTridimensional{
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	public double obtenerArea() {
		return (6 * lado * lado);
	}

	public double obtenerVolumen() {
		return (lado * lado * lado);
	}
}
