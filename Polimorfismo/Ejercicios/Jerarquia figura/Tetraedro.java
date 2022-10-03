package ejercicios;

public class Tetraedro extends figuraTridimensional{
	
	public Tetraedro(double lado) {
		this.lado = lado;
	}
	
	public double obtenerArea() {
		return (lado * lado * Math.sqrt(3));
	}
	
	public double obtenerVolumen() {
		return (lado * lado * lado * (Math.sqrt(2) / 12));
	}

}
