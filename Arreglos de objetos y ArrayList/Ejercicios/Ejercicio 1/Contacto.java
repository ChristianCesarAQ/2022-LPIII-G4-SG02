package Ejercicios;

public class Contacto {
	String nombre;
	String telefono;
	String direccion;
	
	Contacto(String nombre, String telefono, String direccion){
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void  setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void  setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void  setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
	return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
	}		
}
