//p43_ConteoNumeros-

import java.util.Scanner;

public class p43_ConteoNumeros {
    public static void main(String[] args) {
        int c, n, s, cp, cn, cc;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Cuento y sumo los números introducidos por ti :)");

        c=n=s=cp=cn=cc=0;
        do{
            System.out.println("Ingresa un número:");
            n=obj.nextInt();
            System.out.println("Si deseas dejar de ingresar números escribe: '999'.");
            if (n!=999){
                c++; s+=n;
                if (n>0) cp++; else if(n<0); else cc++;
            }
        } while (n != 999);
        System.out.printf("Introdujiste: %d números",c);
            
        System.out.printf("\n La suma es : %d números",s);

        System.out.printf("\nPositivos: %d \nNegativos: %d \nCeros: %d\n",cp,cn,cc);
        
    }
}
