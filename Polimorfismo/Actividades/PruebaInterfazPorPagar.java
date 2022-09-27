//nombre: PruebaInterfazPorPago.java
//descripcion: prueba la interfaz PorPagar
package Actividades;

public class PruebaInterfazPorPagar {

	public static void main(String[] args) {
		
		//arreglo PorPagar de cuatro elementos
		PorPagar[] objetosPorPagar = new PorPagar[6];
		
		//llema el arreglo con objetos que implementan PorPagar
		objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
		objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
		objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
		objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
		//parametros(primer paramtro = numero de cuotas, segundo parametro = monto  por cuota)
		objetosPorPagar[4] = new Prestamo(3, 1500.00);
		objetosPorPagar[5] = new Prestamo(4, 2000.00);
		
		System.out.println("Facturas y Empleados procesados en forma polimorfica:\n");
		
		//procesa en forma generica cada elemento en el arreglo objetosPorPagar
		for(PorPagar porPagarActual : objetosPorPagar) {
			//imprime porPagarActual y monto de pago apropiado
			System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago() );
		}//fin for

	}//fin main

}//fin clase
