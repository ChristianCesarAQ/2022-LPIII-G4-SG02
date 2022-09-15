package Ejercicios;

public class EvaluacionCrediticia {

	public static void main(String[] args) {
		
		final int personas = 8;
		//sexo, trabajo y sueldo(enteros)  
		// filas representan los tres datos, columnas representan la cantidad de personas
        int[][]Datos = new int [3][personas];
        
        Sexo(Datos);
        Trabajo(Datos);
        Sueldo(Datos);
        
        imprimirDatosArray(Datos);
 
        //Mostramos los datos
        System.out.println("Porcentaje de hombres: "+porcentajeHombres(Datos) + "%");
        System.out.println("Porcentaje de mujeres: "+porcentajeMujeres(Datos) + "%");
 
        System.out.println("Porcentaje de hombres que trabajan: "+porcentajeHombresTrabajan(Datos) + "%");
        System.out.println("Porcentaje de mujeres que trabajan: "+porcentajeMujeresTrabajan(Datos) + "%");
 
        System.out.println("El sueldo promedio de los hombres que trabajan: "+sueldoPromedioHombres(Datos));
        System.out.println("El sueldo promedio de los mujeres que trabajan: "+sueldoPromedioMujeres(Datos));
 
    }
    public static void Sexo (int Datos[][]){
        for (int i = 0; i < Datos[0].length; i++){
            int numero = (int)(Math.random() * 2 + 1);
            Datos[0][i] = numero;
        }
    }
    public static void Trabajo (int Datos[][]){
        for (int i=0; i < Datos[1].length; i++){
            int numero=(int)(Math.random() * 2 + 1);
            Datos[1][i]=numero;
        }
    }
    public static void Sueldo (int Datos[][]){
        for (int i=0; i < Datos[1].length; i++){
            for (int j=0; j < Datos[2].length; j++){
                if (Datos[1][j] == 2){
                    Datos[2][j] = 0;
                }else{
                    int numero = (int)(Math.random()*((3000-950)+1))+950;
                    Datos[2][j]=numero;
                }
            }
 
        }
    }
 
    public static void imprimirDatosArray (int Datos[][]){
        String dato[]={"Sexo", "Trabajo", "Sueldo"};
        for (int i=0;i<Datos.length;i++){
            System.out.println(dato[i]);
            for (int j=0;j<Datos[i].length;j++){
                System.out.println("fila " +i+"  columna " +j+ " = " +Datos[i][j]);
            }
 
        }
    }
   
    public static double porcentajeHombres (int Datos[][]){
        int cont=0;
        for(int i=0;i<Datos[0].length;i++){
            if (Datos[0][i]==1){
                cont+=1;
            }
        }
        double porcentaje=(cont*100)/Datos[0].length;
        return porcentaje;
    }
    
    public static double porcentajeMujeres (int Datos[][]){
        int cont=0;
        for(int i=0;i < Datos[0].length;i++){
            if (Datos[0][i]==2){
                cont+=1;
            }
        }
        double porcentaje=(cont*100)/Datos[0].length;
        return porcentaje;
    }
    
    public static double porcentajeHombresTrabajan(int Datos[][]){
        int cont=0;
        for(int i=0;i<Datos[0].length;i++){
                if (Datos[0][i]==1 && Datos[1][i]==1){
                    cont+=1;
                }
        }
 
        return (cont*100)/(porcentajeHombres(Datos)/10);
    }
    
    public static double porcentajeMujeresTrabajan(int Datos[][]){
        int cont=0;
        for(int i=0;i<Datos[0].length;i++){
                if (Datos[0][i]==2 && Datos[1][i]==1){
                    cont+=1;
                }
        }
 
        return (cont*100)/(porcentajeMujeres(Datos)/10);
    }
    
    
    
    public static double sueldoPromedioHombres(int Datos[][]){
        int cont=0;
        double suma=0;
        for(int i=0;i<Datos[0].length;i++){
                if (Datos[0][i]==1 && Datos[1][i]==1 && Datos[2][i]!=0){
                    suma+=Datos[2][i];
                    cont+=1;
                }
        }
        return suma/cont;
    }
    
    public static double sueldoPromedioMujeres(int Datos[][]){
        int cont=0;
        double suma=0;
        for(int i=0;i<Datos[0].length;i++){
                if (Datos[0][i]==2 && Datos[1][i]==1 && Datos[2][i]!=0){
                    suma+=Datos[2][i];
                    cont+=1;
                }
        }
        return suma/cont;
    }
 
   }

	
