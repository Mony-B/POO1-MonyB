/*p24_PagaTrabajador2 - Calcula paga de un trabajador
 * 
 */

import java.util.Scanner;

public class p24_PagaTrabajador2 {
    public static void main(String[] args) {
        String nombre;
        int horas, extra =0;
        float paga, impuesto, tasa, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;
    
        System.out.println("Calculando el pago de un trabajador, aquí pagamos al doble las horas extra (>40)");
        System.out.println("Ingresa tu nombre, plis: "); nombre=obj.nextLine();
        System.out.println("Escribe la cantidad de horas que trabajaste: "); horas=obj.nextInt();
        System.out.println("¿Cuánto te pagan por hora?: "); paga=obj.nextFloat();

        if (horas>40){
            extra=horas-40;
            pagabruta=40*paga+(extra*paga*2);
        }
        else {
            pagabruta= horas * paga;
        }
        impuesto=pagabruta*tasa;
        paganeta=pagabruta-impuesto;

        System.out.printf("El trabajador %s trabajó %d horas a una paga de %.2f pesos; a una tasa de %.2f\n", nombre, horas, paga, tasa);
        System.out.println("Paga bruta = "+ pagabruta);
        System.out.println("Impuestos: "+ impuesto);
        System.out.println("Paga neta ="+ paganeta);

        System.out.println("\nOMG Llegaste hasta aquí, felicidades, amigui <3");

    }

    

    

}
