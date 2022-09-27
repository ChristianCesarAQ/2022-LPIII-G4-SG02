//nombre: EmpleadoAsalariado.java
//descripcion: extiende a empleado, que implementa a PorPagar
package Actividades;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	
	//constructor con cuatro argumentos
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
		
		super(nombre, apellido, nss);
		setSalarioSemanal(salario);
		
	}//fin constructor
	
    public void setSalarioSemanal(double salario) {
    	salarioSemanal = salario;
    }
    
    public double getSalarioSemanal() {
    	return salarioSemanal;
    }
    
    //implementa el metodo de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
    	return getSalarioSemanal();
    }//fin metodo obtenerMontoPago
    
    @Override
    public String toString() {
		 return super.toString() + "\nsalario semanal: $" + salarioSemanal;
    }

}
