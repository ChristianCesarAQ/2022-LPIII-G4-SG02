package ejercicios;

public class Circulo extends figuraBidimensional {
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double obtenerArea() {
		//retorna area de circulo
		return (3.1416 * radio * radio);
	}
}
