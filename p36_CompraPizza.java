
/*p36_Pizza -  Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de compra con descuento.*/

import java.util.Scanner;

public class p36_CompraPizza {

    public static void main(String[] args) {
        int tamaño, cantidad;
        float descuento = 0, total, des, precio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Hola, Seleccione el tamaño de su pizza:");
        System.out.println("1 - Chica... $5");
        System.out.println("2 - Mediana... $10");
        System.out.println("3 - Grande... $20");
        System.out.print("Elige :)\n ");
        tamaño = obj.nextInt();

        System.out.print("¿Cuántas pizzas son en total? ");
        cantidad = obj.nextInt();

        switch (tamaño) {
            case 1:
                precio = 5;
                break;
            case 2:
                precio = 10;
                break;
            case 3:
                precio = 20;
                break;
            default:
                System.out.println("Opción Inválida");
        }

        total = precio * cantidad;
        if (total > 2000) {
            descuento = total * 0.15f;
            des = total - descuento;
            System.out.println("Tamaño de la compra: " + tamaño);
            System.out.println("Cantidad (es) comprada (s): " + cantidad);
            System.out.println("Total de la compra: $" + total);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total con descuento: $" + des);
        } else {
            System.out.println("Tamaño de la compra: " + tamaño);
            System.out.println("Cantidad comprada: " + cantidad);
            System.out.println("Total de la compra: $" + total);
        }

    }
}
