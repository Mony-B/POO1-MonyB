//p10_HipotenusaTriangulo - Se desea calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados, usando la siguiente fórmula:
//hipotenusa = raizcuadrada( longitudLado1 * longitudLado1 + logitudLado2 * longitudLado2 )

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        double longitudLado1, longitudLado2, hipotenusa;

        Scanner obj = new Scanner(System.in);

        System.out.println("Calcularé la hipotenusa de un triángulo resctángulo :)");
        System.out.println("Ingresa la longitud del primer lado: "); 
        longitudLado1=obj.nextDouble();

        System.out.println("Ingresa la longitud del segundo lado:");
        longitudLado2 = obj.nextDouble();

        hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("La hipotenusa de tu triángulo es: "+ hipotenusa);



    }
}
