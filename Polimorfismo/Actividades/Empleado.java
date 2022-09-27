//nombre: Empleado.java
//descripcion: superclase abstracta Empleado que implementa a PorPagar
package Actividades;

public abstract class Empleado implements PorPagar{
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	//constructor con tres argumentos
	public Empleado(String nombre, String apellido, String nss) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}
	
	@Override
	public String toString() {
		 return "empleado asalariado: " + primerNombre + " " + apellidoPaterno + "\nnumero de seguro social: " + numeroSeguroSocial;
	}

}//fin de la clase Empleado
