package p95_Empleado02;
public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); //instanciar una clase
        Empleado empleado2 = new Empleado(); //instanciar una clase
        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 45;
        empleado2.Nombre = "Maria López";
        empleado2.Edad = 25;

        Empleado empleado3;
        empleado3 = new Empleado();//instanciar una clase
        //Asignar valores a las propiedades
        empleado3.Nombre = "Jorge";
        empleado3.Edad = 15;


        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre:" + empleado1.Nombre);
        System.out.println("Empleado 1 edad:" + empleado1.Edad);
        System.out.println(empleado1.toString()); //invocar método toString() del objeto

        System.out.println("Empleado 2 nombre:" + empleado2.Nombre);
        System.out.println("Empleado 2 edad:" + empleado2.Edad);
        System.out.println(empleado2.toString());//invocar método toString() del objeto

        System.out.println("\nEmpleado 3");
        System.out.println(empleado3.toString());//invocar método toString() del objeto
    }
}