/*p56_SumaPromedio - + y prom */

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        float cal, suma, prom;
        int n;
        Scanner obj = new Scanner(System.in);
        boolean repite = true;

        while (repite) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Suma y promedio de calificaciones.");

            cal = suma = prom = 0;
             System.out.println("¿Cuántas calificaciones deseas procesar?");
             n = obj.nextInt();
             for (int x=1; x<=n; x++){
                System.out.println("¿Calificación " + x + "? " );
                cal = obj.nextFloat();
                suma+= cal;
            }
            prom = suma / n;
            System.out.println("\nLa suma es: "+suma);
            System.out.println("\nEl promedio es: "+prom);
            System.out.println("\n¿Deseas repetir? (S/N) ");
            String resp = obj.next().toLowerCase();
            repite = resp.equals("s");
        }
        System.out.println("\nProceso terminado, bye.");
    }
}
