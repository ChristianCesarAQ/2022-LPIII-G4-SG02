package Actividad4;

public class Chocolates extends Goodies {
    private String tipo;
    private double importe;

    public Chocolates(int id, String description, float price, String tipo, double importe) {
        super(id, description, price);
        this.tipo = tipo;
        this.importe = importe;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public double getimporte() {
        return importe;
    }

    public void setimporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "tipo='" + tipo + '\'' +
                ", importe=" + importe +
                '}';
    }
}