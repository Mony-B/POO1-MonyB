//p27AcpEst-Acepta estudainte según calif y edad
import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double c1, c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        
        System.out.println("Universidad de Mony :p SA de CV\nSistema de Admisión");
        
        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();    
        
        System.out.print("Dame la edad: ");
        edad = obj.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad, así que continuemos... ");
            System.out.println("Dame dos calificaciones, separadas por la tecla Enter:");

            c1 = obj.nextFloat();
            c2 = obj.nextFloat();

            if (c1 >= 8 && c2 >= 8) {
                System.out.printf("\nBIENVENIDO %s, tienes %d años y calificaciones de %.2f y %.2f ... ACEPTADO\n", nombre, edad, c1, c2);
            } else {
                System.out.println("\nSólo aceptamos estudiantes con calificaciones de 8 en adelante, estudia más y vuelve ;)");
            }
        } else {
            System.out.println("Sólo aceptamos estudiantes mayores de edad, sorry :(");
        }

        System.out.println("\nAdiós, nos vemos pronto");
    }
}
