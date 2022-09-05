package ejercicios;

public class Rectangulo {
	//representa esquina inferior izquierda
	Coordenada esquina1;
	//representa esquina superior derecha
	Coordenada esquina2;
	
	//color(Nro 4)
	String color; 
	static String ultimoColor;
	
	Rectangulo(Coordenada c1, Coordenada c2){
		this.color = getNuevoColor();
		this.esquina1 = c1;
		this.esquina2 = c2;
	}
	
	Rectangulo(Coordenada coordenada){
		this.color = getNuevoColor();
		this.esquina1 = new Coordenada(0,0);
		this.esquina2 = coordenada;
	}
	//
	
	public String getColor() {
		return this.color;
	}
	public String getNuevoColor() {
		
		if(ultimoColor == null) {
			ultimoColor = "Verde";
			return ultimoColor;
		}
		if(ultimoColor.equals("Verde") ) {
			ultimoColor = "Amarillo";
			return ultimoColor;
		}
		if(ultimoColor.equals("Amarillo") ) {
			ultimoColor = "Rojo";
			return ultimoColor;
		}
		if(ultimoColor.equals("Rojo") ) {
			ultimoColor = "Verde";
		}
		return ultimoColor;
	}
	//
	public Coordenada getEsquina1() {
		return esquina1;
	}
	
	public  void setEsquina1(Coordenada c) {
		esquina1 = c;
	}
	
	public Coordenada getEsquina2() {
		return esquina2;
	}
	
	public  void setEsquina2(Coordenada c) {
		esquina2 = c;
	}
	
	
	public String toString() {
		 return "Rectangulo{" + "esquina1 =" + esquina1 + ", esquina2 =" + esquina2 +'}';
		 }
}
