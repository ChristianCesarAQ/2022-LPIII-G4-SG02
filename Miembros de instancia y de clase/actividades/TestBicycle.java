package ACTIVIDADES;

public abstract class TestBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle a,b;
		a = new Bicycle("Adam Smith", 1);
		b = new Bicycle("Ben Jones", 5);
		a.distanceTraveveled(240);
		System.out.println(b.getOwnerName());
		b.distanceTraveveled(1100);
		Bicycle mostOld = Bicycle.mostUsed(a,b);
		System.out.println(mostOld);
	}
	

}
