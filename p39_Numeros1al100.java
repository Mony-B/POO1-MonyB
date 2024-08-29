/*p39_Numeros1al100.java - Imprimir números de 1 hasta N*/

import java.util.Scanner;

public class p39_Numeros1al100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprimiendo los valores desde 1 hasta N...");
        System.out.println("¿Hasta qué número quieres que llegue?");
        int n = new Scanner(System.in).nextInt();
        System.out.println("¿En incrementos de?");
        int i = new Scanner(System.in).nextInt();

        int c = 0;
        while (c <= n) {
            System.out.printf("%d ", c);
            c = c + i;
        }

        System.out.println("\nEl ciclo ha terminado :)");
        System.out.println(c);
    }
}
