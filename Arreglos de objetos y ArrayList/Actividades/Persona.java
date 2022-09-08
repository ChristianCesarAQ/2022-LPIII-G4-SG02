package Actividades;
import java.util.Arrays;
import java.util.Scanner;
public class Persona {
	public static void main(String[] args) {
		
		 Scanner sn = new Scanner(System.in);
		 //Matriz cuadrada de 4x4
		 int matriz[][] = new int[4][4];
		 //Variables utilizadas
		 boolean salir = false;
		 int opcion, fila, columna;
		 //Utilizado para indicar si hemos entrado en la 1ª opcion
		 boolean rellenado = false;
		 //Menu
		 do {
			 //Mensajes del menu
			 System.out.println("Menu");
			 System.out.println("1. Rellenar Matriz");
			 System.out.println("2. Sumar fila");
			 System.out.println("3. Sumar columna");
			 System.out.println("4. Hallar la suma de la diagonal principal");
			 System.out.println("5. Hallar la suma de la diagonal inversa");
			 System.out.println("6. Hallar la media de la matriz");
			 System.out.println("7. Salir");
			 System.out.println("Elije una opcion");
			 opcion = sn.nextInt();
			 
			 switch (opcion) {
				 case 1:
					 rellenarMatriz(sn, matriz);
					 //Ahora si podemos acceder al resto de opciones
					 rellenado = true;
					 break;
				 case 2:
					 if (rellenado) {
						 //Validamos la fila
						 do {
							 System.out.println("Elige una fila");
							 fila = sn.nextInt();
						 } while (!(fila >= 0 && fila < matriz.length));
						 System.out.println("La suma de los valores de la fila " + fila
						 + " es: " + sumaFila(matriz, fila));
					 } else {
						 System.out.println("Debes rellenar la matriz primero");
					 }
					 break;
				 case 3:
					 if (rellenado) {
						 //Validamos la fila
						 do {
							 System.out.println("Elige una columna");
							 columna = sn.nextInt();
						 } while (!(columna >= 0 && columna < matriz.length));
						 System.out.println("La suma de los valores de la columna " + columna
						 + " es: " + sumacolum(matriz, columna));
					 }
				 break;
				 case 4:	
					//primera forma
					//System.out.println("la suma de la diagonal principal "+((matriz[0][0])+(matriz[1][1])+(matriz[2][2])+(matriz[3][3])));
					
					//segunda forma
					System.out.println("la suma de la diagonal principal " + sumarDiagonalPrincipal(matriz));
				 break;
				 case 5:
					 //primera forma
					 //System.out.println("la suma de la diagonal inversa "+((matriz[0][3])+(matriz[1][2])+(matriz[2][1])+(matriz[3][0])));
					 
					 //segunda forma
					 System.out.println("la suma de la diagonal inversa " + sumarDiagonalInversa(matriz));
				 
					 break;
				 case 6: 
					 System.out.println("La media de la matriz es "+ media(matriz));
				 break;
				 case 7:
					 salir = true;
				 break;
	
				 default:
					 System.out.println("Tienes que meter un valor entre 1 y 7");
			 }
			 
	 } while (!salir);
	 System.out.println("FIN");
	 }
	 /**
	 * Rellena la matriz con valores insertados por el usuario
	 *
	 * @param sn
	 * @param matriz
	 */
	 public static void rellenarMatriz(Scanner sn, int[][] matriz) {
	 for (int i = 0; i < matriz.length; i++) {
	 for (int j = 0; j < matriz[0].length; j++) {
	 System.out.println("Escribe un numero en la posicion " + i + " " + j);
	 matriz[i][j] = sn.nextInt();
	 }
	 }
	 }
	 /**
	 * Suma los valores de una determinada fila
	 *
	 * @param matriz
	 * @param fila
	 * @return
	 */
	 public static int sumaFila(int[][] matriz, int fila) {
	 int suma = 0;
	 for (int j = 0; j < matriz.length; j++) {
	 suma += matriz[fila][j];
	 }
	 return suma;
	 }
	 public static int media(int[][] matriz) {
	 int media=0;
	 int suma=0;
	 for(int i = 0 ;i < matriz.length;i++) {
		 for(int j=0;j < matriz.length; j++)
			 suma+=matriz[i][j];
	 }
	 media=suma/((matriz.length)*(matriz.length));
	 return media;
	 }	
	 public static int sumacolum(int[][] matriz, int columna) {
		 int suma = 0;
		 for (int i = 0; i < matriz.length; i++) {
		 suma += matriz[i][columna];
	 }
	 return suma;
	 }
	 
	 //metodo sumar diagonal principal
	 public static int sumarDiagonalPrincipal(int[][] matriz) {
		    int suma = 0;
		    int x = 0, y = 0;
		    while (x < matriz.length && y < matriz[0].length) {
		        suma += matriz[y][x];
		          x++;
		          y++;
		    }
		    return suma;
		  }
		    
	//metodo sumar diagonal inversa
	 public static int sumarDiagonalInversa(int[][] matriz){
		    int suma = 0;
		    int x = 0, y = matriz.length - 1;
		      while (x < matriz.length && y >= 0) {
		          suma += matriz[y][x];
		          x++;
		          y--;
		      }
		    
		    return suma;
		  }
	 
	 
	 
 }