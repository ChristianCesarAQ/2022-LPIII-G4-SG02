package ejercicios;

public class Triangulo extends figuraBidimensional{
	
	public Triangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public double obtenerArea() {
		return (lado * altura / 2);
	}

}
