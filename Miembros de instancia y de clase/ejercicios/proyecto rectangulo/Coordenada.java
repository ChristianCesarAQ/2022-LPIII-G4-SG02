package ejercicios;
public class Coordenada {
	private int x;
	private int y;
	
	Coordenada(){
		x = 0;
		y = 0;
	}
	
	Coordenada(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Coordenada(Coordenada c){
		x = c.getX();
		y = c.getY();
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double distancia(Coordenada c) {
		//Math.sqrt((x1-x2)(x1-x2) + (y1-y2)(y1-y2));
		return (double)Math.sqrt((getX() - c.getX())*(getX()-c.getX()) + (getY()-c.getY())*(getY()- c.getY()));
	}
	
	public static double distancia(Coordenada c1, Coordenada c2) {
	
		return (double)Math.sqrt((c2.getX() - c1.getX())*(c2.getX() - c1.getX()) + (c2.getY()- c1.getY())*(c2.getY()- c1.getY()));
	}

	
	@Override
	public String toString() {
		 return "Coordenada{" + "x=" + x + ", y=" + y +'}';
		 }

}















