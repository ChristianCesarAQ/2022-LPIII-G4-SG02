
public class Edificio {
	
	private int numPisosEdificio;
	
	private Elevador elevador;//por composicion
	
	//constructor
	public Edificio(int numPisos) {
		this.numPisosEdificio = numPisos;	
		//
		this.elevador = new Elevador(numPisosEdificio);
	}
	
	
	public void setNumPisosEdificio(int numPisos) {
		this.numPisosEdificio = numPisos;
	}
	public int getNumPisosEdificio() {
		return this.numPisosEdificio;
	}
	
	
	public void setElevador(Elevador elevador) {
		this.elevador = elevador;
	}
	public Elevador getElevador() {
		return this.elevador;
	}
	
	
	
}

