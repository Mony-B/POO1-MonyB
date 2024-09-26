package p95_Empleado02;
public class Empleado {
    public String Nombre;
    public int Edad;
    
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]"; 
        //en lugar de regresar objeto por objeto, regresa todos en una misma línea
    }
   
}