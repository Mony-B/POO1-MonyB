/*p38_AcepEst2 - Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.
 */
import java.util.Scanner;

public class p38_AceptarEstudiante2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float c1, c2, c3, promedio;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Proceso de aceptación. \n '''Universidad Kitty Kat'''");

        System.out.println("Ingresa tu nombre: ");
        nombre = obj.nextLine();
        System.out.println("¿Cuál es tu sexo? ");
        System.out.println("[F]emenino");
        System.out.println("[M]asculino");
        op = Character.toUpperCase(obj.next().charAt(0));

        if (op == 'M') {
            System.out.println("\nEsta es una escuela sólo para mujeres. Adiós. ");
        } else if (op == 'F') {
            System.out.println("¿Cuál es tu edad?");
            edad = obj.nextInt();

            if (edad > 21) {
                System.out.println("Eres mayor de edad, continuemos...");
                System.out.println("Ingresa tres calificaciones, separadas por enter.");
                c1 = obj.nextFloat();
                c2 = obj.nextFloat();
                c3 = obj.nextFloat();

                promedio = (c1 + c2 + c3) / 3;

                if (promedio >= 8 && promedio <= 9.5) {
                    System.out.println("Hola, " + nombre + ":))");
                    System.out.println("Tu promedio es de: " + promedio);
                    System.out.println("¡Bienvenida! Cumples con los requisitos.");
                } else {
                    System.out.println("Sólo aceptamos estudiantes con un promedio entre 8 y 9.5.");
                }
            } else {
                System.out.println("Sólo aceptamos estudiantes mayores de 21 años.");
            }
        } else {
            System.out.println("Opción inválida.");
        }

        System.out.println("\nGracias por usarme, bye...");
    }
}
