/*p62_SecuenciaNumeros2
Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee: */

import java.util.Scanner;

public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner (System.in);

        System.out.println("Imprimo secuencia de números con el N de renglones que desees.");
        System.out.print("¿Cuántos renglones quieres? ");
        int n=obj.nextInt();

        for(int c = 1; c <= n; c ++) {

            for (int j = 1; j <= c; j ++)
                System.out.print(j +" " );
            
            System.out.println();
        }
        obj.close();
    }
}
