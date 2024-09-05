/*p55_SumaParesImpares - + */

import java.util.Scanner;

public class p55_SumaParesImpares {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, s=0;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Imprime impares de 1 a N, pares de N a 1, y la suma de ambos casos.");
        System.out.println("Números de 1 a N - Impares...[1]");
        System.out.println("Números de N a 1 - Pares...[2]");
        System.out.println("         Salir          [3]");

        System.out.println("\nElije :)");
        int op = obj.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a N...");
                System.out.println("¿Hasta dónde?");
                n = obj.nextInt();
                for (int i = 1; i <= n; i+=2) {
                    System.out.print(i + " ");
                    s+=i;
                }
                System.out.println("\nLa suma de impares es: "+s);
                break;
            case 2:
                System.out.println("Imprimiendo de N a 1...");
                System.out.println("¿Desde dónde?");
                n = obj.nextInt();
                n = (n%2==0 ? n: --n);
                for (int i = n; i >= 1; i-=2) { 
                    System.out.print(i + " ");
                    s+=i;
                }
                System.out.println("\nLa suma de pares es: "+s);
                break;
            case 3:
                System.out.println("Has decidido salir del sistema... Bye.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        System.out.println("\nProceso terminado.");
        obj.close();
 
    }
}
