package ejercicios;

public class Cuadrado extends figuraBidimensional{
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double obtenerArea() {
		return (lado * lado);
	}
}
