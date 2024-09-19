/*p71_MayorTresNum - calcula cuál es el mayor */
import java.util.Scanner;

public class p71_MayorTresNumeros {
    public static float Mayor(float n1, float n2, float n3) {
        float may = n1;
        if (n2 > may) may = n2;
        if (n3 > may) may = n3;
        return may;
    }

    public static void main(String[] args) {
        float n1, n2, n3, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Ingresa 3 números, separados por un espacio:");
        n1 = obj.nextFloat();
        n2 = obj.nextFloat();
        n3 = obj.nextFloat();

        res = Mayor(n1, n2, n3);

        System.out.println("El mayor de los tres números es: " + res);

        obj.close();
    }
}
