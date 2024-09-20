/*p80_Ang - Recibe un ángulo entre 0-360 grados y regresa el tipo de ángulo  */
import java.util.Scanner;

public class p80_Angulo {
    
    /**
     * Determina el tipo de ángulo según su medida.
     * 
     * @param angle (float) el ángulo en grados
     * @return (String) una descripción del tipo de ángulo:
     *         "El ángulo es agudo" si está entre 0 y 90 grados,
     *         "El ángulo es recto" si es exactamente 90 grados,
     *         "El ángulo es obtuso" si está entre 90 y 180 grados,
     *         "El ángulo es llano" si es exactamente 180 grados,
     *         "El ángulo es cóncavo" si está entre 180 y 360 grados,
     *         "Ángulo inválido" si es negativo o mayor a 360 grados.
     */
    public static String Angulo(float angle) {
        if (angle >= 0 && angle < 90) return "El ángulo es agudo";
        else if (angle == 90) return "El ángulo es recto";
        else if (angle > 90 && angle < 180) return "El ángulo es obtuso";
        else if (angle == 180) return "El ángulo es llano";
        else if (angle > 180 && angle < 360) return "El ángulo es cóncavo";
        else return "Ángulo inválido"; 
    }

    public static void main(String[] args) {
        float angle;
        Scanner in = new Scanner(System.in);
        char continuar;

        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Este programa determina el tipo de ángulo en grados (0-360).");
            System.out.println("Ingresa un ángulo y el programa te dirá si es agudo, recto, obtuso, llano o cóncavo.");
            do {
                System.out.print("Ingrese un ángulo (0-360): ");
                angle = in.nextFloat();
            } while (angle < 0 || angle > 360);

            System.out.println(Angulo(angle));

            System.out.print("¿Desea ingresar otro ángulo? (s/n): ");
            continuar = in.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
    }    
}
