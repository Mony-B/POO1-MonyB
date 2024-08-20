
//p11_CalcularAngulo - Se desea calcular el 3er angulo de un triangulo dados los dos primeros angulos del mismo 
//ángulo3 = 180-(angulo1 + angulo2)
import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner ang = new Scanner(System.in);

        System.out.println("Calcularé el 3er ángulo de un triángulo :)");
        System.out.println("Dame el primer ángulo :");
        angulo1 = ang.nextFloat();
        System.out.println("Dame el segundo ángulo :");
        angulo2 = ang.nextFloat();

        angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("El tercer ángulo es "+ angulo3);
        

    }
}
