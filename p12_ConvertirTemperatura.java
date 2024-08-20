// p12_ConvTemperatura - Se desea convertir una temperatura de grados faherenheit a grados celsius
 //celsius=(fahrenheit-32)*(5/9)

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double faherenheit, celsius;
        Scanner far = new Scanner(System.in);

        System.out.print("Ingresa los grados Fahrenheit : ");
        faherenheit = far.nextFloat();

        celsius = (faherenheit - 32) * 5/9;
        System.out.println("En grados celsius es : "+ celsius);
    }
}
