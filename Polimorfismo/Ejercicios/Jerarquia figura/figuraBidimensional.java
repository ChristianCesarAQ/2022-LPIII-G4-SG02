package ejercicios;

//extender una clase abstracta de la clase abstracta Figura
public abstract class figuraBidimensional extends Figura{
	public double altura;
	
	//constructor
	public figuraBidimensional() {
		tipoFigura = "bidimensional";
	}
		
	public abstract double obtenerArea();
	
	
}
