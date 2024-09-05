/*p57_TablasMultiplicar -  Imprimir las tablas del 1 hal n hasta el 10 */


import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean repite = true;

        while (repite) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("¿Hasta qué tabla de multiplicar quieres?");
            int n = obj.nextInt();
            System.out.println("¿Hasta dónde lo quieres?");
            int m = obj.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Tabla del " + i);

                for (int j = 1; j <= m; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println(); 
            }

            System.out.println("¿Quieres continuar? (S/N)");
            String resp = obj.next().toUpperCase();
            repite = resp.equals("S");
        }
        obj.close();
        System.out.println("Proceso terminado.");
    }
}
