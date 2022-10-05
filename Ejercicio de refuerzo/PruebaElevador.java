import java.util.*;
public class PruebaElevador {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int opcion=0;
		boolean salir = false;
		int numPisos;
		
		System.out.println("Ingrese en numero de pisos del edificio");
	    numPisos = leer.nextInt();
	    
	    Edificio edificioUno = new Edificio(numPisos);//crear objeto de tipo edifico
		
		do {
			
		    
			System.out.println("\n\t===Opciones del elevador===");
		    System.out.println("1. Subir");
		    System.out.println("2. Bajar");
		    System.out.println("3. Salir");
		    
		    System.out.println("Elije una opcion");
		    opcion = leer.nextInt();
		    int pisoDestino;
	        int numePersonas;
	         
		    switch(opcion) {
		  
		    case 1://subir
		    	System.out.println("\nPiso Actual: " + edificioUno.getElevador().getPisoActual());
		    	System.out.println("Ingrese piso destino");
			    pisoDestino = leer.nextInt();
			    System.out.println("Ingrese el numero de personas que suben");
			    numePersonas = leer.nextInt();
			    edificioUno.getElevador().subir(pisoDestino, numePersonas);
		    	break;
		    	
		    case 2://bajar
		    	System.out.println("\nPiso Actual: " + edificioUno.getElevador().getPisoActual());
		    	System.out.println("Ingrese piso destino");
			    pisoDestino = leer.nextInt();
			    System.out.println("Ingrese el numero de personas que suben");
			    numePersonas = leer.nextInt();
			    edificioUno.getElevador().bajar(pisoDestino, numePersonas);
		    	break;
		    	
		    case 3://salir
		    	salir = true;
		    	System.out.println("Gracias por usar nuestro elevador");
		    	break;	
		    default:
				 System.out.println("Ingresar un valor entre 1 y 3");
		    }
			
		}while(salir==false);

	}

}
