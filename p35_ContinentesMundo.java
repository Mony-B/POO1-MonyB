/*p35_ContinMund - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África, 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar
un mensaje de error. */

import	java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un número entre 1 y 6 y te diré a qué Continente corresponde:\n");
        int num = new Scanner(System.in).nextInt();
    switch (num){
        case 1: System.out.println("1 = Asia :/"); break;
        case 2: System.out.println("2 = África :p"); break;
        case 3: System.out.println("3 = América del Norte :]"); break;
        case 4: System.out.println("4 = América del Sur :)"); break;
        case 5: System.out.println("5 = Antártida :o"); break;
        case 6: System.out.println("6 = Europa :3"); break;
        default:
        System.out.println("¡ERROR! \n Número incorrecto.");
        break;
    }
    System.out.println("Gracias por usar este programa, ayos tonoto :)");
    }
}

