package ejercicio2;

import java.util.*;
public class pruebaImpactoEcologico {

	public static void main(String[] args) {
		
		//arraylist de objetos
		ArrayList <impactoEcologico> impacto = new ArrayList <impactoEcologico>();
		
		//agregar objetos al arraylist
		impacto.add(new Edificio(123, 353,34.4));
		impacto.add(new Auto(133, 24.4));
		impacto.add(new Bicicleta(3,34));
		
		int count = 0;
		//invocando polimórficamente el método obtenerlmpactoEcologico de cada objeto
		for(impactoEcologico impactoEcologicoPolimorfico : impacto) {
			System.out.println(impacto.get(count));
			System.out.println("Impacto Ecologico: "+ impactoEcologicoPolimorfico.obtenerImpactoEcologico());
			count+=1;
			System.out.println();
		}
	}

}
