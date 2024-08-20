// 014_CalcTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos considerando que 
// 1 día tiene 24 hora - 1 hora tiene 60 minutos - 1 minuto tiene 60 segundos 

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner hor = new Scanner (System.in);
        System.out.println("Convertiré horas en minutos, días y segundos :)");
        System.out.print("Dame la cantidad de horas : ");
        horas = hor.nextFloat();

        dias = (horas / 24);
        minutos = (horas * 60);
        segundos = horas * (60 * 60);

        System.out.println("En días son: " + dias  + "\nEn minutos son:  "+ minutos + "\nEn segundos son: "+ segundos);
    }    

}