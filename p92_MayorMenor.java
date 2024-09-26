//p92_MyMen - Muestra el numero mayor y el menor del arreglo

import java.util.Scanner;

public class p92_MayorMenor {
    public static int Mayor(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

    public static int Menor(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("Mayor - Menor");
        System.out.print("¿Cuántos números quieres ingresar? ");
        num = obj.nextInt();

        if (num <= 0) {
            System.out.println("Debes ingresar al menos un número.");
            return;
        }

        int[] numeros = new int[num];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            numeros[i] = obj.nextInt();
        }

        System.out.println("\nLos números son: ");
        for (int numeromuestra : numeros) {
            System.out.printf("%d ", numeromuestra);
        }
        
        System.out.printf("\nEl elemento mayor es: %d", Mayor(numeros));
        System.out.printf("\nEl elemento menor es: %d", Menor(numeros));
        
        obj.close();
    }
}
