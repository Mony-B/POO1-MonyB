package p95_Empleado02;

public class Empleado {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        Empleado empleado2=new Empleado();


        empleado1.setnombre("Carlos Pérez");
        empleado1.setEdad(25);

        System.out.println("Empleado 1 (nombre):"+empleado1.getNombre());
        System.out.println("Empleado 1 (edad):"+empleado1.getEdad());

    }
    
}
