package ejercicio2;

public class Auto implements impactoEcologico{

	final double FACTOR_DE_EMISION = 0.3;
	
	private double emisionCO2;
	private double consumoCombustible;
	
	//constructor
	public Auto(double emisionCO2, double consumoCombustible) {
		this.emisionCO2 = emisionCO2;
		this.consumoCombustible = consumoCombustible;
	}
	
	@Override
	
	public double obtenerImpactoEcologico() {
		return (obtenerDatoActividad() * FACTOR_DE_EMISION);
	}
	
	public double obtenerDatoActividad() {
		 return (emisionCO2 + consumoCombustible);
	 }
	
	//getters y setters
	public void setEmisionCO2(double emisionC02) {
		this.emisionCO2 = emisionCO2;
	}
	public double getEmisionCO2() {
		return this.emisionCO2;
	}
	public void setConsumoCombustible(double consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}
	public double getConsumoCombustible() {
		return this.consumoCombustible;
	}
	
	@Override
	public String toString() {
		return "Auto\n" + "Consumo combustible: " + getConsumoCombustible() +  "\nEmision CO2: " + getEmisionCO2();
	}
	
	
}
