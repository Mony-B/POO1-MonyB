/*p79_SumMult - Recibe tres parámetros y regresa la suma de nums múltiplos de 3 o 4 en el rango especificado */
import java.util.Scanner;

public class p79_SumaMultiplos {
    /**
     * Suma los múltiplos de 'cons' en el rango de 'ini' a 'fin'.
     * @param ini (int) el valor inicial del rango
     * @param fin (int) el valor final del rango
     * @param cons (int) el número del que se buscarán los múltiplos (3 o 4)
     * @return (int) la suma de los múltiplos de 'cons' en el rango
     */
    public static int SumaMultiplo(int ini, int fin, int cons) {
        int s = 0;
        for (int i = ini; i <= fin; i++) {
            // Verificar si el número es múltiplo de 'cons'
            if (i % cons == 0) {
                s += i;
            }
        }
        return s;
    }

    /**
     * Verifica si el rango es válido (valor inicial menor que el valor final).
     * @param ini (int) el valor inicial del rango
     * @param fin (int) el valor final del rango
     * @return (boolean) true si el rango es válido, false de lo contrario
     */
    public static boolean Rango(int ini, int fin) {
        return ini < fin;
    }

    public static void main(String[] args) {
        int ini, fin, cons;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Suma los múltiplos de 3 o 4 en un rango que definas (el número de inicio debe de ser menor que el número del final).");

        System.out.print("Ingresa el valor inicial: "); 
        ini = obj.nextInt();
        System.out.print("Ingresa el valor final: "); 
        fin = obj.nextInt();

        if (!Rango(ini, fin)) {
            System.out.println("Rango no válido...");
            return; // Termina el programa si el rango no es válido
        }

        System.out.println("Elige una opción:");
        System.out.println("[1] Sumar múltiplos de 3");
        System.out.println("[2] Sumar múltiplos de 4");
        int opcion = obj.nextInt();

        if (opcion == 1) {
            cons = 3;
        } else if (opcion == 2) {
            cons = 4;
        } else {
            System.out.println("Opción inválida.");
            return; // Termina el programa si la opción no es válida
        }

        int suma = SumaMultiplo(ini, fin, cons);
        System.out.println("La suma de los múltiplos de " + cons + " en el rango (" + ini + "," + fin + ") es: " + suma);
    }
}
