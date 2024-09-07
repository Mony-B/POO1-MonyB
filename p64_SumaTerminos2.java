/*p64_SumaTerminos2 - Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma: */

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Imprimo una secuencia de términos, el número de renglones que desees y su suma.");
        System.out.print("¿Cuántos términos? ");
        int n = new Scanner(System.in).nextInt();

        double suma = 0.0;

        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            double termino = 1.0 / i;
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.printf(" + 1/%d", i);
            }
            suma += termino;
        }

        System.out.printf("\nSuma: %.2f\n", suma);
    }
}
