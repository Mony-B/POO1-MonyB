import java.util.Scanner;

public class p125_Exception5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int a[] = {10,20,30,40};

        System.out.println("Los elementos del arreglo son: ");
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println("\n¿A cuál posición del arreglo quieres acceder?");
        try {
            int pos = new Scanner(System.in).nextInt();
            System.out.println("La posición " + pos + ", contiene valor " + a[pos]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nTe pasaste");

    }

    }
}