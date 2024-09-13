/*p66_PromedioNumeros -  calcular el promedio de 3 números utilizando funciones */

import java.util.Scanner;

public class p66_PromedioNumeros {
    public static float Promedio (float num1, float num2, float num3)        {
    float suma, prom;
    suma=num1+num2+num3;
    prom=suma/3;
    return prom;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        System.out.println("Dados 3 números, obtener su promedio.");

       System.out.print("Dame el primer número: ");float num1= obj.nextFloat();
       System.out.print("Dame el segundo número: ");float num2= obj.nextFloat();
       System.out.print("Dame el tercer número: ");float num3= obj.nextFloat();

       float prom = Promedio(num1, num2, num3);
       System.out.println("\nEl promedio es: "+prom);
       System.out.println("\nEl promedio es: "+Promedio(10, 10, 10));
    }
}
