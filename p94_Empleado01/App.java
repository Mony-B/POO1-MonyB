package p94_Empleado01;

/*Programa principal */

public class App {
    public static void main(String[] args) {

       Empleado empleado1=new Empleado(); //instanciar una clase
       Empleado empleado2=new Empleado(); 

       //Asignar valores a las propiedades
       empleado1.Nombre = "Juan Pérez"; 
       empleado1.Edad = 45;
       empleado2.Nombre = "María López";
       empleado2.Edad = 25;

       Empleado empleado3; 
       empleado3 = new Empleado();//instanciar 

       //Asignar valores a las propiedades
       empleado3.Nombre = "Jorge";
       empleado3.Edad = 15;

       System.out.print("\033[H\033[2J");
       System.out.flush();

       System.out.println("Empleado 1 (nombre): "+empleado1.Nombre);
       System.out.println("Empleado 1 (edad): "+empleado1.Edad);
       System.out.println(empleado1.toString()); //invocar método to string del objeto

       System.out.println("Empleado 2 (nombre): "+empleado1.Nombre);
       System.out.println("Empleado 2 (edad): "+empleado1.Edad);
       System.out.println(empleado2.toString());//invocar método to string del objeto

       System.out.println("Empleado 3");
       System.out.println(empleado3.toString());//invocar método to string del objeto



        

    }
   
}
