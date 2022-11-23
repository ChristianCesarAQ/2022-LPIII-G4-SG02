package Actividad1;


public class Persona {
	private String nombres;
	private String direccion;
	private String telefono;
	
	public Persona(String nombres, String direccion, String telefono) {
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombres() {
		return this.nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Persona) {
			//casting para la comparacion
			Persona persona = (Persona)obj;
			if(this.nombres==persona.nombres) {
				return true;
			}else {
				return false;
			}
		//si no es una instacia de persona	
		}else {
			return false;
		}
	}
	
}
