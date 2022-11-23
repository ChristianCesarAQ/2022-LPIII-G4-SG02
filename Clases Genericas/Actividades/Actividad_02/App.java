package Actividad2;

public class App {
	public static void main(String[] args) {
		Integer integer1 =1 ;
		Integer integer2 = 1;
		String String1 = "Carlos";
		String String2 = "Rodriguez";
		Persona persona1 = new Persona("Manuel","Av los Alamos","112233");
		//Persona persona2 = new Persona("Carlos","Av Brazil","112233");
		
		OrderedPair<Integer, Integer> prueba1 = new OrderedPair<Integer,Integer>(integer1,integer2);
		OrderedPair<Integer, String> prueba2 = new OrderedPair<Integer,String>(integer2,String1);
		OrderedPair<String, Persona> prueba3 = new OrderedPair<String, Persona>(String2,persona1);
		System.out.println(prueba1);
		System.out.println(prueba2);
		System.out.println(prueba3);
		
	}
}
