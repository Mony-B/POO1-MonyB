//p21_VerNum - Verifica si un # es positivo o negativo

import java.util.Scanner;

public class p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[23"); System.out.flush();

        System.out.println(" Verificaré si un número es positivo, negativo o cero\n :)");
        System.out.println(" Dame un número entero: ");
        int numero = new Scanner(System.in).nextInt();

        if (numero>0) System.out.println("El número "+ numero +" es positivo");
        if (numero<0) System.out.println("El número "+ numero +" es negativo");
        if (numero==0) System.out.println("El número "+ numero +" es cero");

        System.out.println("Gracias por usar este sistema bonis :)");

    }
}
