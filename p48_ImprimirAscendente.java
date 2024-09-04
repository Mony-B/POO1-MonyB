/*p48_ImprimirAscendente-Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse hasta que el usuario lo decida. */

import java.util.Scanner;

public class p48_ImprimirAscendente {
    public static void main(String[] args) {

    int n, c, s, prom;
    float promedio;
    char resp;
    Scanner obj = new Scanner(System.in);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    do
    {
        System.out.println("Imprimo números impares ascendentes desde 1 hasta donde me digas.\n");
        System.out.print("¿Hasta dónde? ");
        n = obj.nextInt();
        s = 0;
        c = 1;
        prom=0;
        while (c <= n) {
            System.out.printf("%d ", c);
            s += c; 
            c += 2;
            prom++;
        }
        promedio = (float) s / prom;
        System.out.printf("\nLa suma es %d", s);
        System.out.printf("\nEl promedio es: %.2f",promedio);
        System.out.print("\n¿Deseas continuar (S/N) ? ");
        resp = Character.toUpperCase(obj.next().charAt(0));
    }while(resp!='N');System.out.println("\n¡Gracias por utilizar este programa! :)");
}}
