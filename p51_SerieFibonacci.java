
/*p51_SerFib-Se desean imprimir los primeros n números de la será de Fibonacci. El proceso debe de poder repetirse hasta que el usuario lo decida. */
import java.util.Scanner;

public class p51_SerieFibonacci {
    public static void main(String[] args) {
        int a, b, c, n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime n números de la serie Fibonacci.");
            System.out.print("Ingrese el número de términos: ");
            n = obj.nextInt();
            
            a = 0;
            b = 1;
            
            System.out.print("Serie Fibonacci: ");
            for(int i = 0; i < n; i++) {
                System.out.printf("%d ", a);
                c = a + b;
                a = b;
                b = c;
            }
            
            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa");
    }
}
