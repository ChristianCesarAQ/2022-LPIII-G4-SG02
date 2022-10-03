package ejercicio2;

public class Bicicleta implements impactoEcologico {

	final double FACTOR_DE_EMISION = 0.05;
	private int vidaUtil;
	private double usoCarbono;
	
	//constructor
	public Bicicleta(int vidaUtil, double usoCarbono) {
		this.vidaUtil = vidaUtil;
		this.usoCarbono = usoCarbono;
	}
	
	@Override
	public double obtenerImpactoEcologico() {
		return obtenerDatoActividad() * vidaUtil ;
	}
	
	public double obtenerDatoActividad() {
		return (getVidaUtil() * getUsoCarbono() / 2);
	}
	
	//getters y setters
	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public int getVidaUtil() {
		return this.vidaUtil;
	}
	public void setUsoCarbono(int usoCarbono) {
		this.usoCarbono = usoCarbono;
	}
	public double getUsoCarbono() {
		return this.usoCarbono;
	}
	
	@Override
	public String toString() {
		return "Bicicleta\n" + "Vida Util: " +getVidaUtil() + "\nUso de carbono: " + getUsoCarbono() ;
	}
	
}
