/*p23_ConvertirTemperatura - conv de grados centigrados a grados Farenheit y vicev */

import java.util.Scanner;

public class p23_ConvertirTemperatura2 {
    public static void main(String[] args) {
        float temp, res;
        int op;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convirtiendo temperaturas...");
        System.out.println("[ 1 ] Farenheit a Centigrados");
        System.out.println("[ 2 ] Centigrados a Farenheit");
        System.out.print("Elige una opción :) \n"); op =obj.nextInt();

        if (op ==1){
            System.out.println("Convirtiendo de Farenheit a Centigrados");
            System.out.println("Ingresa la temperatura en grados Farenheit, plis:"); temp = obj.nextFloat();
            res= (temp -32)*5f/9f;
            System.out.printf("%.2f Farenheit equivale a %.2f Centigrados ", temp, res);
       }
        else if (op ==2){
            System.out.println("Convirtiendo de Centigrados a Farenheit");
            System.out.println("Ingresa la temperatura en grados Centigrados, plis:"); temp = obj.nextFloat();
            res= (temp * 9f / 5f) + 32;
            System.out.printf("%.2f Centigrados equivale a %.2f Farenheit", temp, res);
           
        }
        else    
        System.out.println("\nElegiste una opción inválida, adiós :))");

        System.out.println("\nGracias por usar este programa. Bais :p");

    }
}
