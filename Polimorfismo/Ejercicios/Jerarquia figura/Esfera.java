package ejercicios;

public class Esfera extends figuraTridimensional {
	public Esfera(double radio) {
		this.radio = radio;
	}
	
	public double obtenerArea() {
		return (4 * 3.1416 * radio * radio);
	}
	
	public double obtenerVolumen() {
		return (4 * 3.1416 * radio * radio * radio / 3);
	}
}
