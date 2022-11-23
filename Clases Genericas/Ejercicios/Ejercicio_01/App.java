package Ejercicio1.ejercicio1;

import java.util.Arrays;
public class App {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExistsList {
		try {
		CandyBags b1 = new CandyBags(5,"Crackers");
		Goodies g1 = new Goodies(1,"Carintos", 1.8f);
		Chocolates choc1 = new Chocolates(2,"Chocolate",1.5f,"Amargo");
		Biscuits bis1 = new Biscuits(3,2.3f,"Chocolate","rectangulo");
		Soda sal1 = new Soda(4,1.60f,"redonda",2.2);
		Sweet dul1 = new Sweet(5,1.70f,"cuadrada",9.2);

		b1.add(g1);
		b1.add(choc1);
		b1.add(bis1);
		b1.add(sal1);
		b1.add(dul1);

		System.out.println(b1);

		System.out.println(" ");
		System.out.println("------cheapest------");

		System.out.println(b1.cheapest());
		
		System.out.println(" ");
		System.out.println("------mostExpensive------");
		System.out.println(b1.mostExpensive(2));
		
		}catch(IsFull | ExistsList exc) {
			System.out.println(exc.getMessage());
		}
		

	}

}