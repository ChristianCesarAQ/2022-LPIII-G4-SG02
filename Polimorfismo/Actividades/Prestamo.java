//nombre: Prestamo.java
//descripcion:  implementa la interfaz PorPagar
package Actividades;

public class Prestamo implements PorPagar{
	private int numeroDeCuotas;
	private double montoDeCuota;
	
	//constructor con dos argumentos
	public Prestamo(int numCuotas, double montoCuota) {
		setNumeroDeCuotas(numCuotas);
		setMontoDeCuota(montoCuota);
	}
	
	//getters y setters
	public void setNumeroDeCuotas(int numCuotas) {
		numeroDeCuotas = numCuotas;
	}
	public int getNumeroDeCuotas() {
		return numeroDeCuotas;
	}
	
	public void setMontoDeCuota(double montoCuota) {
		montoDeCuota = montoCuota;
	}
	public double getMontoDeCuota() {
		return montoDeCuota;
	}
	//fin getters y setters
	
	//implementa el metodo de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
    	return getNumeroDeCuotas() * getMontoDeCuota();
    }//fin metodo obtenerMontoPago
    
    @Override
	public String toString() {
		 return "Prestamo:\n" + "numero de cuotas: " + numeroDeCuotas + "\nmonto de cuota: " + montoDeCuota;
	}
}
