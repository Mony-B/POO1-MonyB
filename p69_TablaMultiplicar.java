/*p69_TablaMultiplicar - imprime tabla de  ultiplicar hasta donde el usuario quiera */

import java.util.Scanner;

public class p69_TablaMultiplicar {
    public static void Tabla(int tabla, int limite){
        for (int i=1; i<=limite; i++)
            System.out.printf("%d x %d = %d \n", tabla, i, tabla*i);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj=new Scanner(System.in);

        System.out.print("¿Qué tabla de multiplicar quieres? "); int tabla=obj.nextInt();
        System.out.print("¿Hasta dónde? "); int limite=obj.nextInt();

        Tabla(tabla, limite);

        //Tabla(3, 5);
        //Tabla(2, 4);
        //Tabla(99, 2);
    }
}
