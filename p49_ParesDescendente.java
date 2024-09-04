/*p49_ParesDescendente -Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n), 
además deberá imprimirse la suma y el promedio de esos números pares. El proceso debe de poder repetirse
hasta que el usuario lo decida. */

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        int n, c, s, count;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nImprime numeros pares descendente desde 100\n");
            System.out.print("¿Hasta dónde? "); 
            n = obj.nextInt();
            s = 0;
            count = 0;

            c = 100;

            while (c >= n) {
                if (c >= n) {
                    System.out.printf("%d ", c);
                    s += c;
                    count++;
                }
                c -= 2;
            }

            double promedio = (count > 0) ? (double)s / count : 0;
            System.out.printf("\nLa suma es %d", s);
            System.out.printf("\nEl promedio es %.2f", promedio);
            System.out.print("\n¿Deseas continuar (S/N)? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\n¡Gracias por utilizar este programa!");
    }
}
