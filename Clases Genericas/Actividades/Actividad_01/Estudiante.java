package Actividad1;

public class Estudiante extends Persona{
	private String especialidad;
	private Procedencia procedencia;
	
	public Estudiante(String nombres, String direccion, String telefono, String especialidad, Procedencia procedencia) {
		super(nombres, direccion, telefono);
		this.especialidad = especialidad;
		this.procedencia = procedencia;
	}
	
	public String getEspecialidad() {
		return this.especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public Procedencia getProcedencia() {
		return this.procedencia;
	}
	
	public void setProvincia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Estudiante) {
			//casting para la comparacion
			Estudiante estudiante = (Estudiante)obj;
	
			if(getProcedencia().equals(estudiante.getProcedencia())==true && getNombres() == estudiante.getNombres()) {
				return true;
			}else {
				return false;
			}	
		}else {
			return false;
		}
	}
	
}
