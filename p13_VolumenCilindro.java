// p13_VolCil - Se desea calcular el volumen de un cilindro dado su radio y altura

//- volumen = PI*(radio *radio)* altura

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcularé el volumen de un cilindro :)");
        System.out.print("Ingresa el radio: ");
        radio = scanner.nextDouble();
        System.out.print("Ingresa la altura: ");
        altura = scanner.nextDouble();

        volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es " + volumen);

      
    }
}



   