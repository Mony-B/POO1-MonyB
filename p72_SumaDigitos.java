/*p72_SumaDigitos - suma los dígitos individuales de un número entero
1971 - 10, 2023-7, 12345- * 
*/

import java.util.Scanner;

public class p72_SumaDigitos {
    public static long SumaDigitos(long n) {
        long suma=0, digito;
        while (n!=0){
            digito=n%10;
            suma+=digito;
            n=n/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        long num;

        System.out.print("\033[H\033[2J");
        System.out.println("Ingresa un número entero y sumaré sus dígitos.");
        num = new Scanner(System.in).nextLong();
        System.out.println("Suma dígitos=\n "+ SumaDigitos(num));
    }


}
