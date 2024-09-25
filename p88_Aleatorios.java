/*p88_Aleatorios - genera número aleatorios */

import java.util.Random;

public class p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd=new Random();
        int a1=rnd.nextInt();
        int a2=rnd.nextInt(30)+1;
        int min=10;
        int max=30;
        int a3=rnd.nextInt(max - min + 1) + min; //Generea un número aleatorio en el rango de los números enteros
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Número entero aleatorio positivo: " +Math.abs(a1));
        System.out.println("Número entero 1..30:  " +Math.abs(a2));
        System.out.println("Número entero 10..30:  " +Math.abs(a3));
    }
}
