//p15_ConvDol - Dada una cantidad en pesos y la cotización del dolar, se desea obtener el equivalente en dólares 

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares, precio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertiré pesos mexicanos a dólares, según el valor actual del dólar :) ");
        System.out.print("Ingresa la cantidad de pesos mxn que deseas convertir: ");
        pesos = scanner.nextDouble();
        System.out.print("¿Cuánto vale el dólar actualmente? ");
        precio = scanner.nextDouble();

        dolares = pesos / precio;

        System.out.println(pesos + " pesos mexicanos equivalen a " + dolares + " dólares.");

    }
}
