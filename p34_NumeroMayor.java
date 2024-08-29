/*p34_NumMay-Dados tres números enteros, verificar cual es el mayor. */
import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Verificaré cuál número es el mayor de los 3 que ingresarás.");

        System.out.print("Ingresa el primer número: ");
        n1 = obj.nextInt();

        System.out.print("Ingresa el segundo número: ");
        n2 = obj.nextInt();

        System.out.print("Ingresa el tercer número: ");
        n3 = obj.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.printf("El mayor número es el primero: %d%n", n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.printf("El mayor número es el segundo: %d%n", n2);
        } else {
            System.out.printf("El mayor número es el tercero: %d%n", n3);
        }

        System.out.println("Gracias por usar este programa, ¡bye! :)");
    }
}
