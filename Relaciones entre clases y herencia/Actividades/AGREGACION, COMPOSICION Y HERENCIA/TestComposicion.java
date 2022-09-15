package ACTIVIDADES;

public class TestComposicion {
    public static void main(String[] args) {
        Persona P1 = new Persona(1001, "Geraldyne", "Roque", 3454236);
        Persona P2 = new Persona(102, "Jose", "Mejia", 7645768);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        P2.setNombre("Geral");
        P1.getCuenta().setSaldo(550.55);
        P2.getCuenta().setSaldo(50.55);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}