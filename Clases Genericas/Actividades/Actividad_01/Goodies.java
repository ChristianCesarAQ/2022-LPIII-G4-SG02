package Actividad1;

public class Goodies {
	private int id;
	private String descripcion;
	private float precio;
	
	
	public Goodies(int id, String descripcion, float precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		
	}public float getPrecio() {
		return this.precio;
	}
	public void setId(float precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Goodies) {
			//casting para la comparacion
			Goodies goodies = (Goodies)obj;
			if(this.id==goodies.id) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
