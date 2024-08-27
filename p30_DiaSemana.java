//p30_DiaSemana -  Dice que día de la semana es dado un número entre 1 y 7
import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un número entre 1 y 7 y te diré el número de la semana con letra:\n");
        int dia = new Scanner(System.in).nextInt();
    switch (dia){
        case 1: System.out.println("Domingo... Misa"); break;
        case 2: System.out.println("Lunes... Clases :("); break;
        case 3: System.out.println("Martes... Clases :]"); break;
        case 4: System.out.println("Miércoles... Clases"); break;
        case 5: System.out.println("Jueves... Clases"); break;
        case 6: System.out.println("Viernes... DayVa"); break;
        case 7: System.out.println("Sábado... Mimir"); break;
        default:
            System.out.println("¿Te quieres ir temprano a desayunar o neh?");
            break;
    }
    System.out.println("Gracias por usar este programa, ayos tonoto :)");
    }
}
