/*p46_TabConv - Imprime tabla de conversión de pes a dólar en rango deseado */

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        char resp;
        float tc = 20.74f, te = 25.00f;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Tabla de conversión de peso a dólar y euro.\n");

            do {
                System.out.print("Inicio: ");
                ini = obj.nextInt();
                System.out.print("Fin: ");
                fin = obj.nextInt();
            } while (fin < ini);

            System.out.println("Peso \t\t Dólar \t\t Euro");
            System.out.println("------------------------------------------------");

            c = ini;
            while (c <= fin) {
                System.out.printf("%10d \t %10.2f \t %10.2f\n", c, c / tc, c / te);
                c++;
            }

            System.out.println("-------------------------------------------");
            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');

        System.out.println("\nGracias por utilizar este programa!");
        obj.close();
    }
}


