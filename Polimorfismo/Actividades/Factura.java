//nombre: Factura.java
//descripcion: la clase factura implementa la interfaz PorPagar
package Actividades;

public class Factura implements PorPagar{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	//constructor con cuatro argumentos
	public Factura(String Pieza, String descripcion, int cuenta, double precio) {
		numeroPieza = Pieza;
		descripcionPieza = descripcion;
		setCantidad(cuenta);
		setPrecioPorArticulo(precio);
	}//fin constructor
	
	
	//metodo requerido para realizar el contrato con la interfaz PorPagar
	@Override
	public double obtenerMontoPago() {
		return getCantidad() * getPrecioPorArticulo();//calcula el costo total
	}//fin del metodo obtenerMontoPago
	
	//getters y setters
	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}
	
	public String getNumeroPieza() {
		return this.numeroPieza;
	}
	
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}
	
	public String getDescripcionPieza() {
		return this.descripcionPieza;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}
	
	public double getPrecioPorArticulo() {
		return this.precioPorArticulo;
	}
	
	@Override
	public String toString() {
		 return "Factura:\n" + "numero de pieza: " + numeroPieza + "("+descripcionPieza + ")\n" + "cantidad: " + cantidad + "\nprecio por articulo: $" + precioPorArticulo;
		 }
	
}//fin de la clase factura
