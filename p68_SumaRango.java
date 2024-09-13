/*p68_SumaRango.java - Suma un rango devalores por el usuario */

import java.util.Scanner;

public class p68_SumaRango {
    public static int SumaRango(int ini, int fin){
        int suma=0;
        for (int i=ini; i<=fin; i++){
            suma=suma+i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int suma=0, ini, fin;
        do{
            System.out.println("Calculo la suma del rango de valores que ingreses.");
            System.out.println("Ingresa el # de inicio:"); ini=obj.nextInt();
            System.out.println("Ingresa el # de fin:"); fin=obj.nextInt();
        } while (ini>fin);
        suma= SumaRango(ini, fin);

        System.out.println("\nLa suma del rango es: "+suma);
    }
}
