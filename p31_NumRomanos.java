//p31_NumRomanos -convierte un número normal a romano (1-10)

import java.util.Scanner;

public class p31_NumRomanos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame un número entre 1 y 10, para darte su equivalente en númeor romano:\n");
        int num =new Scanner(System.in).nextInt();
        
        switch (num) {
            case 1: System.out.print("I"); break;
            case 2: System.out.print("II"); break;
            case 3: System.out.print("III"); break;
            case 4: System.out.print("IV"); break;
            case 5: System.out.print("V"); break;
            case 6: System.out.print("VI"); break;
            case 7: System.out.print("VII"); break;
            case 8: System.out.print("VIII"); break;
            case 9: System.out.print("IX"); break;
            case 10: System.out.print("X"); break;
        
            default:
                System.out.println("Número inválido");
                break;
        }
        System.out.println("\nGracias por utilizar este programa, bais");

    }
}
