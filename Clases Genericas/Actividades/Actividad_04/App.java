package Actividad4;

public class App {
	public static void main(String[] args) throws Exception {
	Bag<Goodies> bolsaGolocinas = new Bag<>(5);
	Soda fanta = new Soda(543, "cilindrica", 2.5f, "naranja", "Si", "No", "No");
	Sweet casino = new Sweet(531, "Con crema", 2.4f, "Fresa", "Si", "Si", "No");
	Chocolates donofrio = new Chocolates(822, "ancho", 1.5f, "Dulce", 23.5);

	bolsaGolocinas.add(fanta);
	bolsaGolocinas.add(casino);
	bolsaGolocinas.add(donofrio);
	System.out.println(bolsaGolocinas);
	}
}
