// p75_NumMen - Programa con una función que pida 4 números enteros y devuelva el menor de ellos

import java.util.Scanner;

public class p76_NumeroMenor {
    /**
     * Compara cuatro números enteros y devuelve el menor de ellos.
     * @param n1 (int) el primer número a comparar
     * @param n2 (int) el segundo número a comparar
     * @param n3 (int) el tercer número a comparar
     * @param n4 (int) el cuarto número a comparar
     * @return (int) regresa el número más pequeño entre los cuatro números proporcionados
    */

    public static int Menor(int n1,int n2,int n3,int n4) {
        int men = n1;  // Asignar el primer número como el menor por defecto
        if(n2 < men) men = n2;
        if(n3 < men) men = n3;
        if(n4 < men) men = n4;
        return men;
    }

    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Comparo 4 números y devuelvo el menor de ellos...");
        System.out.println("Ingresa cuatro números enteros, separados por un espacio: ");
        
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        n4 = obj.nextInt();

        System.out.printf("\nEl menor de los cuatro números es: %d\n", Menor(n1, n2, n3, n4));
    }
}
