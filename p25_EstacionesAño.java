/*p25_EstacionesAño - Mnada un msj en base al número de estación del año
 * 
 */
import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nDame un número entre 1 y 4, te diré qué estación del año es :) ");
        int n= new Scanner(System.in).nextInt();

        if(n>=1 && n<=4) {
            System.out.println("Chido");
            if (n==1) System.out.println("\nPrimavera");
            if (n==2) System.out.println("\nVerano");
            if (n==3) System.out.println("\nOtoño");
            if (n==4) System.out.println("\nInvierno");
        }
        else {
            System.out.println("Esa estación no existe, sorry");
        }

        System.out.println("\nProceso terminado, adiós :)");
                
    }
}
