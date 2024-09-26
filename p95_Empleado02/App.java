package p95_Empleado02;

public class App {
    private String Nombre;
    private int Edad;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    @Override
    public String toString() {
        return "App [Nombre=" + Nombre + ", Edad=" + Edad + "]";
    }
    
    
}
