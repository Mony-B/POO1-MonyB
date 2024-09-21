/*p85_NombresEdades-leer una serie de nombres y edades en dos arreglos */
import java.util.Scanner;

public class p85_NombresEdades {
    public static void main(String[] args) {
        int n = 0, s = 0, p = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush(); 

        System.out.println("Nombres & Edades.");
        System.out.println("¿Cuántos elementos deseas procesar?");
        n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.println("Ingresa los nombres y edades de los " + n + " elementos: ");
        for (int i = 0; i < n; i++) {
            obj.nextLine(); // Limpiar el buffer
            System.out.print("Nombre [" + (i + 1) + "]: ");
            nombres[i] = obj.nextLine();
            System.out.print("Edad [" + (i + 1) + "]: ");
            edades[i] = obj.nextInt();
        }

        System.out.println("\nLos nombres y edades capturados son: ");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + edades[i]);
            s = s + edades[i]; // Sumar edades
        }

        // Calcular y mostrar el promedio
        p = s / n;
        System.out.println("\nEl promedio de edades es: " + p);
    }
}
