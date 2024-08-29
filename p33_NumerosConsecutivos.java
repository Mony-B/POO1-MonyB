/* p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos (9,10,11) y mandar mensaje confirmándolo, si no lo son (1,4,6) mandar mensaje de error.
 */

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verificaré si los 3 números que ingreses son consecutivos o no...");

        System.out.println("Ingresa el primer número: ");
        int n1 = obj.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int n2 = obj.nextInt();

        System.out.println("Ingresa el tercer número: ");
        int n3 = obj.nextInt();

        if ((n2 - n1 == 1) && (n3 - n2 == 1)) {
            System.out.println("Los números son consecutivos.");
        } 
        else {        
            System.out.println("¡ERROR! \nLos números NO son consecutivos.");
        }
        System.out.println("Gracias por usar este programa, ¡bye! :)");
    }
}
