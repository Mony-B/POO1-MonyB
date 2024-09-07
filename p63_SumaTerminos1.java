/*p63_SumaTerminos1 -  Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma: */

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Imprimo una secuencia de términos armónicos, el número de renglones que desees y su suma.");
        System.out.print("¿Cuántos términos? ");

        int n = new Scanner(System.in).nextInt();
        int suma = 0;
        int termino = 1;
        System.out.print("Salida: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(termino + (i < n ? "+" : ""));
            suma += termino;
            termino = termino * 10 + 1;
        }

        System.out.printf("\nSuma: %d\n", suma);
    }
}
