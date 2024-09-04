/*p50_ConvTemp-Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores
introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final en grados
centígrados y el programa realiza la conversión a farenheit incrementando el valor inicial en 1, hasta llegar al
valor final. Se deberá validar el rango, es decir Final no puede ser menor a Inicial. El proceso debe de poder
repetirse hasta que el usuario lo decida. */

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int ini, fin, c;
        float tm = 32.0f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Imprime una tabla de conversión de Centígrados a Fahrenheit");
            
            do {
                System.out.print("Inicio: "); 
                ini = obj.nextInt();
                System.out.println("------------------------------------------------");

                System.out.print("Fin: "); 
                fin = obj.nextInt();
                System.out.println("------------------------------------------------");

            } while (fin < ini);
            
            c = ini;
            System.out.println("Centígrados\tFahrenheit");
            System.out.println("------------------------------------------------");

            while (c <= fin) {
                System.out.printf("%d\t%.2f\n", c, (c * 1.8) + tm);
                c++;
            }

            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\n¡Gracias por utilizar este programa!");
    }
}
