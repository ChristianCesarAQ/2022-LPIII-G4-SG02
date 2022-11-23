package Actividad2;

public class Persona {
    private String telefono;
    public String nombre;
    private String direccion;
    
    public Persona(String telefono, String nombre, String direccion) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean equals(Object o) {
        if (o instanceof Persona) {
            Persona p = (Persona) o;
            return this.nombre.equals(p.getNombre());
        }
        return false;
    }

    @Override
    public String toString() {
        String s = String.format("\nDireccion: %-10s Nombre: %s Telefono : %s", getNombre(), getTelefono(), getDireccion());
        return s;
    }


}
