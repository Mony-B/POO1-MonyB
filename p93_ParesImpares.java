// p93_ParImp-Muestra elementos pares, impares  y la cuenta de cada uno 

import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Genera 100 números aleatorios (0-20) y muestra todos los números, los pares, los impares y sus cuentas.");
        System.out.println("Elementos del arreglo 'a':");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int parCount = 0;
        System.out.println("Elementos pares del arreglo:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                parCount++;
            }
        }
        System.out.println("\nCantidad de pares: " + parCount);

        int imparCount = 0;
        System.out.println("Elementos impares del arreglo:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                imparCount++;
            }
        }
        System.out.println("\nCantidad de impares: " + imparCount);
    }
}
