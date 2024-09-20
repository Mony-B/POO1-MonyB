/*p77_MedLong-Conviertre pulgadas a cm y m a pies*/

import java.util.Scanner;

public class p78_MedidasLongitud {
    /**
     * Convierte de pulgadas a centímetros.
     * @param num (float) la cantidad en pulgadas a convertir
     * @return (float) el equivalente en centímetros
     */
    public static float PulgadasACentimetros(float num) {
        return num * 2.54f;
    }

    /**
     * Convierte de metros a pies.
     * @param num (float) la cantidad en metros a convertir
     * @return (float) el equivalente en pies
     */
    public static float MetrosAPies(float num) {
        return num * 3.281f;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Convierto pulgadas a centímetros y metros a pies...");

        System.out.println("[1] Convertir pulgadas a centímetros");
        System.out.println("[2] Convertir metros a pies");
        System.out.print("Elige una opción:  ");
        op = obj.nextInt();

        if (op == 1) {
            System.out.print("Ingresa las pulgadas a convertir: ");
            temp = obj.nextFloat();
            res = PulgadasACentimetros(temp);
            System.out.printf("\n%.2f pulgadas equivalen a %.2f centímetro(s).\n", temp, res);
        } else if (op == 2) {
            System.out.print("Ingresa los metros a convertir: ");
            temp = obj.nextFloat();
            res = MetrosAPies(temp);
            System.out.printf("\n%.2f metros equivalen a %.2f pies.\n", temp, res);
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
