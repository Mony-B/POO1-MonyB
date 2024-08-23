/*p22_VerficarSuma -  Verifica si la suma de un num1 + num2 es igual a num3 */

import java.util.Scanner;

public class p22_VerficarSuma {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);  


        System.out.println("\nVerificando si la suma de 2 números es igual a un tercer número");
        System.out.print("Ingresa el primer número: "); n1 = obj.nextFloat();
        System.out.print("Ingresa el segundo número: "); n2 = obj.nextFloat();
        System.out.print("Ingresa el tercer número: "); n3 = obj.nextFloat();
        
        if (n1 + n2 == n3) {
            System.out.println("Son iguales");
            System.out.println(n1 + " + " + n2 + " = " + n3);
        } else {
            System.out.println("Son distintos");
            System.out.println(n1 + " + " + n2 + " != " + n3);
        }
    }
}
