package Ejercicios;

import java.util.*;
public class Principal {

	public static void main(String[] args) {

		
		String nombre, telefono, direccion;
		int opcion;
		int cont=0;
		Scanner leer = new Scanner(System.in);
		
		//arreglo de objetos
		ArrayList <Contacto> Agenda =  new ArrayList<Contacto>();
		
				
		boolean salir = false;
		do {
		    System.out.println("\n\t===Menu===");
		    System.out.println("1. Anadir contacto");
		    System.out.println("2. Buscar contacto");
		    System.out.println("3. Modificar contacto");
		    System.out.println("4. Borrar contacto");
		    System.out.println("5. Eliminar contacto");
		    System.out.println("6. Mostrar contacto");
		    System.out.println("7. Salir");
		    System.out.println("Elije una opcion");
		    opcion = leer.nextInt();
		    switch (opcion) {
			 case 1://anadir contacto
				 //limpiesa del buffer
				 leer.nextLine();
				 System.out.println("Ingrese el nombre: ");
				 nombre = leer.nextLine();
				 
				 System.out.println("Ingrese el telefono: ");
				 telefono = leer.next();
				//limpiesa del buffer
				 leer.nextLine();
				 System.out.println("Ingrese la direccion: ");
				 direccion = leer.nextLine();
				 
				 Agenda.add(new Contacto(nombre, telefono, direccion));
				 break;
			 case 2://buscar contacto
				//limpiesa del buffer
				 leer.nextLine();
				 System.out.println("Ingrese el nombre del contacto a buscar");
				 nombre = leer.nextLine();
				 for(int i=0; i<Agenda.size(); i++) {
					 if(Agenda.get(i).getNombre().equals(nombre)) {
						 //imprime los datos del contacto
						 System.out.println(Agenda.get(i));
						 cont++;
					 }
				 }
				 if(cont==0) {
					 System.out.println("No existe el contacto");
				 }
				 cont = 0;
				 break;
			 case 3://modificar contacto
				 leer.nextLine();
				 System.out.println("Ingrese el nombre del contacto a modificar");
				 nombre = leer.nextLine();
				 for(int i=0; i<Agenda.size(); i++) {
					 if(Agenda.get(i).getNombre().equals(nombre)) {
						 System.out.println(Agenda.get(i));
						 System.out.println("Ingrese el nuevo nombre");
						 Agenda.get(i).setNombre(leer.nextLine());
						 System.out.println("Ingrese el nuevo telefono");
						 Agenda.get(i).setTelefono(leer.nextLine());
						 System.out.println("Ingrese la nueva direccion");
						 Agenda.get(i).setDireccion(leer.nextLine());
						 cont++;
					 }
				 }
				 if(cont==0) {
					 System.out.println("No existe el contacto");
				 }
				 cont = 0;
			     break;
			 case 4://borrar contacto	
				 leer.nextLine();
				 System.out.println("Ingrese el nombre del contacto a eliminar");
				 nombre = leer.nextLine();
				 for(int i=0; i<Agenda.size(); i++) {
					 if(Agenda.get(i).getNombre().equals(nombre)) {
						 Agenda.remove(i);
						 System.out.println("CONTACTO ELIMINADO");
						 cont++;
					 }
				 }
				 if(cont==0) {
					 System.out.println("No existe el contacto");
				 }
				 cont = 0;
			     break;
			 case 5:
				 leer.nextLine();
				 System.out.println("Ingrese el nombre del contacto a eliminar");
				 nombre = leer.nextLine();
				 for(int i=0; i<Agenda.size(); i++) {
					 if(Agenda.get(i).getNombre().equals(nombre)) {
						 Agenda.remove(i);
						 System.out.println("CONTACTO ELIMINADO");
						 cont++;
					 }
				 }
				 if(cont==0) {
					 System.out.println("No existe el contacto");
				 }
				 cont = 0;
				 break;
			 case 6: 
				 System.out.println("Mostrando contactos...");
				 for(int i=0; i<Agenda.size(); i++) {
					 System.out.println(Agenda.get(i));
					 }
			     break;
			 case 7:
				 salir = true;
			     break;

			 default:
				 System.out.println("Ingresar un valor entre 1 y 7");
		 }
		}while(salir==false);
		

	}

}
