// p91_MayProm - Muestra la suma y el promedio de los elementos del arreglo y cuente los mayores 

import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        float n, suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("Calculo suma y promedio de n calificaciones en un arreglo.");

        System.out.println("¿Cuántas calificaciones son?: "); n = obj.nextFloat();
        
        float[] nums = new float[(int) n];

        for (int i=0; i < nums.length; i++ ) {

            System.out.printf("\nIngresa la calificación %d : \n ", i+1);
            nums[i] = obj.nextFloat();
        }
        System.out.print("\nLas calificaciones son:\n" );
        for (float sum : nums) {
            System.out.printf("%.2f ", sum);
            suma = suma + sum;
            
        }
        promedio = suma/nums.length;
        System.out.printf("\n\nLa suma de las calificaciones es:  %.2f", suma);
        System.out.printf("\n\nEl promedio de las calificaciones es: %.2f", promedio);
        
        int MayoresProm=0;
        System.out.print("\n\nLas calificaciones mayores al promedio son: ");
        for (float su : nums){
            if (su > promedio) {
                System.out.printf("\n%.2f",su); MayoresProm++;
            }
        }
System.out.printf("\n\nTotal de calificaciones mayores al promedio: %d ", MayoresProm );
    }
    
}