package Actividad1;

public class App {

	public static void main(String[] args) {

		// Verificar persona
		Persona[] listaPersona = new Persona[3];
		listaPersona[0] = new Persona("Cesar Aguirre", "Calle los Alamos", "972462374");
		listaPersona[1] = new Persona("Guillermo Gonzales", "Av Progreso", "994564565");
		listaPersona[2] = new Persona("Julio Perez", "Av Progreso", "994564565");
		Verificadora<Persona> VerificarPersona = new Verificadora<Persona>(listaPersona);
		System.out.println("-------VERIFICAR PERSONA-------");
		Persona per = new Persona("Cesar Aguirre", "Calle los Alamos", "956462378");
		System.out.println(per.getNombres() + " existe en en el arreglo listaPersona?");
		System.out.println( VerificarPersona.contiene(per));

		// Verificar goodies
		Goodies[] listaGoodies = new Goodies[3];
		listaGoodies[0] = new Goodies(01, "Dore", 4.00f);
		listaGoodies[1] = new Goodies(02, "Chocolate", 10.99f);
		listaGoodies[2] = new Goodies(03, "Caritas", 1.00f);
		Verificadora<Goodies> VerificarGoodies = new Verificadora<Goodies>(listaGoodies);
		System.out.println("-------VERIFICAR GOODIES-------");
		Goodies goodies = new Goodies(02, "Chocolate", 9.99f);
		System.out.println(goodies.getDescripcion() + " existe en en el arreglo listaGoodies?");
		System.out.println(VerificarGoodies.contiene(goodies));

		// Verificar estudiante
		Estudiante[] listaEstudiantes = new Estudiante[3];
		Verificadora<Estudiante> vEstudiante = new Verificadora<Estudiante>(listaEstudiantes);
		
		Procedencia procedencia1 = new Procedencia("Arequipa", "Camana");
		Procedencia procedencia2 = new Procedencia("Lima", "Barranco");
		
		listaEstudiantes[0] = new Estudiante("Manuel Guerrero", "Calle la Union", "948487236", "Seguridad informatica", procedencia1);
		listaEstudiantes[1] = new Estudiante("Christian Linares", "Jr Arequipa", "974497231", "Desarrollador web", procedencia2);
		
		Verificadora<Estudiante> VerificarEstudiantes = new Verificadora<Estudiante>(listaEstudiantes);
		System.out.println("-------VERIFICAR ESTUDIANTE-------");
		Estudiante estudiante = new Estudiante("Manuel Guerrero", "Calle la Union", "948487236", "Seguridad informatica", procedencia1 );
		System.out.println(estudiante.getNombres() + " existe en en el arreglo listaEstudiantes?");
		System.out.println(VerificarEstudiantes.contiene(estudiante));	

	}

}
