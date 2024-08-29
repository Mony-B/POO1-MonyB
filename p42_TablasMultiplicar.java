//p42_TablasMultiplicar - Imprime las tablas de multiplicar

import java.util.Scanner;

public class p42_TablasMultiplicar {
    public static void main(String[] args) {
        int t, c, n;
        
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprimo la tabla de multiplicar desde t hasta n...\n :)");
        System.out.println("¿Qué tabla quieres que imprima? ");
        t = obj.nextInt();
        System.out.println("¿Hasta dónde quieres que llegue? ");
        n = obj.nextInt();
        
        
        c=1;

        while (c <= n){
            
            System.out.printf("%d * %d = %d \n", t, c, t*c);
            c++;
        }
            System.out.println("\nProceso terminado, adiós.");
    }
}
