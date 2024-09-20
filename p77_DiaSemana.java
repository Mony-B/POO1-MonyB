/*p76_DiaSem - Devuelve el día de la semana en letras según el número proporcionado
*/

import java.util.Scanner;

public class p77_DiaSemana {
    /**
     * Devuelve el día de la semana en letras según el número proporcionado
     * @param n (int) número entre 1 y 7 que representa el día de la semana
     * @return (String) el día de la semana en letras
     */
    public static String Semana(int n) {
        switch (n) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Día inválido";
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Devuelvo un día de la semana, respecto al número que ingreses...");
        System.out.print("Dame un número entre 1 y 7: ");
        n = obj.nextInt();

        System.out.printf("\nEl día de la semana es: %s\n", Semana(n));
    }
}
