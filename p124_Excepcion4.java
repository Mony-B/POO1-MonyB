import java.util.InputMismatchException;
import java.util.Scanner;

public class p124_Excepcion4 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Valor del numerador: ");
            int a = obj.nextInt();
            System.out.println("Valor del numerador: ");
            int b = obj.nextInt();

            int c = a / b;

            System.out.println("El resultado de la división es:  " + c);

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Tanto el numerador como el denominador deben de ser números");
            System.out.println("No se puede dividir entre cero. ");
        }
        finally {
            System.out.println("Haya sido como haya sisdo, nos vamos a desayunar. \nBye.");
        }
    }
}