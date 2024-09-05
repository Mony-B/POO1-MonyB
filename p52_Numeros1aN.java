
/** p52_NumeroslaN - Imprime numeros de 1 a n en incrementos de p */

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprime los números de 1 a N, usando For.");
        System.out.println("¿Hasta dónde deseas llegar?");
        int n = new Scanner(System.in).nextInt();
        System.out.println("¿En incrementos de?");
        int p = new Scanner(System.in).nextInt();

        for (int i = 0; i <= n; i += p)
            System.out.print(i + " ");

    }

}