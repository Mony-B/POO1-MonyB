/*p70_CalificacionLetra -  regresa una letra con base al promedio*/

import java.util.Scanner;

public class p70_CalificacionLetra {
    public static char CalifLetra(float prom){
        char letra='X';
        if (prom >=90 && prom<=100) letra='A';
        else if(prom>=80 && prom <90) letra='B';
        else if(prom>=70 && prom <80) letra='C';
        else if(prom>=60 && prom <70) letra='D';
        else letra='F';
        return letra;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        float prom=0;
        do{
            System.out.println("Dae tu promedio en la escala del 1 al 100."); prom=obj.nextFloat();
        } while(prom<0 || prom>100);

        System.out.println("Tu calificación con letra es: "+CalifLetra(prom));
    }
}
