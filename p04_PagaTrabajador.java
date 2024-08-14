//p04_PagaTrabajador - Calcular el pago de un trabajdor

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("\nCalculando el pago de un trabajador");
        //Entrada
        System.out.println("Nombre del trabajdor: "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas:     "); horas = obj.nextInt();
        System.out.println("Pago por hora:        "); paga = obj.nextFloat();
        tasa=0.03;

        //Proceso-Cálculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        //Salida
        System.out.println(String.format("El trabajador %s trabajó %d con una paga de %.2f pesos y una tasa de %.2f",nombre, horas, paga, tasa));
        System.out.println(String.format("Paga Bruta: %.2f",pagabruta));
        System.out.println(String.format("Impuesto: %.2f",impuesto));
        System.out.println(String.format("Paga Neta: %.2f", paganeta));

    }
}
