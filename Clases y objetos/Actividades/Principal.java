package Actividades;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Perro Fido = new Perro("chihuahua", "marron");
        int edades;
        Double peso, temperatura;
        System.out.println("Ingrese el nuevo peso para el perro : ");
        peso = entrada.nextDouble();
        Fido.peso = peso;
        System.out.println("Ingrese la nueva edad para el perro : ");
        edades = entrada.nextInt();
        Fido.setEdad(edades);
        System.out.println("Ingrese la nueva temperatura para el perro : ");
        temperatura = entrada.nextDouble();
        Fido.setTemp(temperatura);
        System.out.println("DIAGNOSTICO: " + Diagnostico.aptoVacunaB(Fido));
        System.out.println(Fido.toString());
        entrada.close();
    }
}
