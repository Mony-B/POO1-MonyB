/*p81_InicializaArregloNumeros -  Inicializar un arreglo numérico con valores flotantes */

import java.util.Scanner;

public class p81_InicializaArregloNumeros {
    public static void main(String[] args) {

        double[] nums = new double[7];

        nums[0]=5.0;
        nums[1]=10.0;
        nums[2]=15.5;
        nums[3]=20.0;
        nums[4]=25.5;
        nums[5]=100.22;
        nums[6]=90.0;
        //nums[7]=100; //no existe posición 7

        Scanner obj= new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Primer elemento: "+nums[0]);
        System.out.println("Último elemento: "+nums[6]);
        //System.out.println("Otro: +"nums[7]); | No se puede, fuera de rango
        System.out.println("\nTodos los elementos del arreglo con un for en base al índice: ");
        for (int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n\nTodos los elemantos del arreglo con un for sin índice: ");
        for(double i : nums)
            System.out.print(i + " ");
        System.out.println("\n\nTodo ha terminado...");

       }
}
