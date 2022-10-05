
public class Elevador {
	
	final int pesoMax = 750;//limite
	private int numPisosEdificio;
	private int pisoActual;
	
	public Elevador(int numPisos) {
		this.numPisosEdificio = numPisos;
		this.pisoActual = 1;
	}
	
	
	public void subir(int pisoObjetivo, int numPersonas) {
		if(numPersonas * 50 >  750) {
			System.out.println("El elevador no puede llevar mas de 750 kg");
		}
		if(pisoObjetivo == pisoActual) {
			System.out.println("El elevador ya esta en el piso " + pisoObjetivo);
		}
		if(pisoObjetivo < 1) {
			System.out.println("El elevador no puede trasladarse a pisos por debajo del piso 1");
		}
		if(pisoObjetivo > numPisosEdificio) {
			System.out.println("El edificio solo cuenta con " + getNumPisosEdificio() + " pisos");
		}
		if(pisoObjetivo < pisoActual) {
			System.out.println("El elevador no puede subir a pisos inferiores\nPiso actual:" + getPisoActual());
		}
		if(pisoObjetivo != pisoActual && pisoObjetivo > 1 && pisoObjetivo <= numPisosEdificio && pisoObjetivo > pisoActual && numPersonas*50 <= 750) {
			System.out.println("Subiendo al piso " + pisoObjetivo);
			setPisoActual(pisoObjetivo);
			System.out.println("Ya estamos en el piso " + getPisoActual());
		}
	}
	public void bajar(int pisoObjetivo, int numPersonas) {
		if(numPersonas * 50 >  750) {
			System.out.println("El elevador no puede llevar mas de 750 kg");
		}
		if(pisoObjetivo == pisoActual) {
			System.out.println("El elevador ya esta en el piso " + pisoObjetivo);
		}
		if(pisoObjetivo < 1) {
			System.out.println("El elevador no puede trasladarse a pisos por debajo del piso 1");
		}
		if(pisoObjetivo > numPisosEdificio) {
			System.out.println("El edificio solo cuenta con " + getNumPisosEdificio() + " pisos");
		}
		if(pisoObjetivo > pisoActual) {
			System.out.println("El elevador no puede bajar a pisos superiores\nPiso actual:" + getPisoActual());
		}
		if(pisoObjetivo != pisoActual && pisoObjetivo > 1 && pisoObjetivo <= numPisosEdificio && pisoObjetivo < pisoActual && numPersonas*50 <= 750) {
			System.out.println("Bajando al piso " + pisoObjetivo);
			setPisoActual(pisoObjetivo);
			System.out.println("Ya estamos en el piso " + getPisoActual());
		}
	}
	
	
	//getters y setters
	public void setNumPisosEdificio(int numPisosEdificio) {
		this.numPisosEdificio = numPisosEdificio;
	}
	public int getNumPisosEdificio() {
		return this.numPisosEdificio;
	}
	
	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}
	public int getPisoActual() {
		return this.pisoActual;
	}
	
	
}
