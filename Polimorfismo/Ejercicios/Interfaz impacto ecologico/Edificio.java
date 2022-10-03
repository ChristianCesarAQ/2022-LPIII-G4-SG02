package ejercicio2;

public class Edificio implements impactoEcologico{
	
	final double FACTOR_DE_EMISION = 0.5; 
	
	//
	private double consumoEnergiaPrimaria;
	private double electricidad;
	private double emisionCO2;
	
	//constructor
	public Edificio(double consumoEnergiaPrimaria, double electricidad, double emisionCO2) {
		this.consumoEnergiaPrimaria = consumoEnergiaPrimaria;
		this.electricidad = electricidad;
		this.emisionCO2 = emisionCO2;
	}
	
	@Override
	public double obtenerImpactoEcologico() {
		return (obtenerDatoActividad() * FACTOR_DE_EMISION);
	}
	
	public double obtenerDatoActividad() {
		return (getConsumoEnergiaPrimaria() * getElectricidad() + getEmisionCO2() );
	}
	
	//getters y setters
	public void setConsumoEnergiaPrimaria(double consumoEnergiaPrimaria) {
		this.consumoEnergiaPrimaria = consumoEnergiaPrimaria;
	}
	
	public double getConsumoEnergiaPrimaria() {
		return this.consumoEnergiaPrimaria;
	}
	public void setElectricidad(double electricidad) {
		this.electricidad = electricidad;
	}
	
	public double getElectricidad() {
		return this.electricidad;
	}
	public void setEmisionCO2(double emisionCO2) {
		this.emisionCO2 = emisionCO2;
	}
	
	public double getEmisionCO2() {
		return this.emisionCO2;
	}
	
	@Override
	public String toString() {
		return "Edificio\n" + "Consumo energia primaria: " + getConsumoEnergiaPrimaria() + "\nElectricidad: " + getElectricidad() + "\nEmision CO2: " + getEmisionCO2();             
	}

}
