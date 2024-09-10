/*p65-SistemaPapeleria - Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de fotocopias. El valor de la copia es: Carta $3, Oficio $4, Doble Oficio $6, debe mostrarse un resumen de ventas con un mensaje de acuerdo a la venta total:
▪ venta menor 50 pesos - “venta moderada”
▪ venta entre 50 y 100 pesos - “venta frecuente
▪ venta mayor a 101 - “venta superada”
Mony B. - Mónica del Rocío */

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int nCar = 0, nOfi = 0, nDobOf = 0, totcop = 0, total = 0, numcop;
        char tipo, resp = 'S'; 
        int ventaCount = 1; 

        // Salida: Mostrar encabezado del sistema de ventas
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        System.out.println("    PAPELERÍA 'MONY <3' S.A. de C.V.");
        System.out.print("Sistema de ventas de copias. \n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * *\n");

        // Entrada de datos: Bucle para registrar ventas
        do {
            // Salida: Mostrar número de la venta
            System.out.println("Venta: " + ventaCount);
            System.out.println(); // Salto de línea entre ventas

            System.out.println("            FOTOCOPIAS");
            System.out.println("-------------------------------------");
            System.out.println("Tipo:       |       Precio:");
            System.out.println("-------------------------------------");
            System.out.println("[C] Carta           $3");
            System.out.println("[O] Oficio          $4");
            System.out.println("[D] Doble Oficio    $6");
            System.out.print("Seleccione su tipo de copia que desea, escribiendo la inicial que corresponda: ");
            tipo = Character.toUpperCase(obj.next().charAt(0)); // Entrada: Tipo de copia

            System.out.print("¿Cuántas copias? ");
            numcop = obj.nextInt(); // Entrada: Cantidad de copias

            // Proceso: Calcular total según el tipo de copia
            switch (tipo) {
                case 'C':
                    total += 3 * numcop;
                    nCar += numcop; // Proceso: Acumular copias de tipo Carta
                    break;
                case 'O':
                    total += 4 * numcop;
                    nOfi += numcop; // Proceso: Acumular copias de tipo Oficio
                    break;
                case 'D':
                    total += 6 * numcop;
                    nDobOf += numcop; // Proceso: Acumular copias de tipo Doble Oficio
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue; // Salida: Mensaje de error y continuar
            }

            // Entrada: Preguntar si se desea registrar otra venta
            System.out.print("¿Otra venta? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));

            System.out.println();

            ventaCount++;
        } while (resp == 'S');

        // Proceso: Calcular el total de copias
        totcop = nCar + nOfi + nDobOf;

        // Salida: Mostrar el resumen diario de ventas
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + (nCar + nOfi + nDobOf));
        System.out.println("-------------------------");
        System.out.println("Carta : " + nCar + " - $ " + (nCar * 3));
        System.out.println("Oficio : " + nOfi + " - $ " + (nOfi * 4));
        System.out.println("Doble Oficio : " + nDobOf + " - $ " + (nDobOf * 6));
        System.out.println("-------------------------");
        System.out.println("Total de Ventas : " + totcop + " - $ " + total);

        // Salida: Determinar y mostrar el mensaje de acuerdo al total de ventas
        if (total < 50) {
            System.out.println("Esta venta es una: 'Venta Moderada' :)");
        } else if (total <= 100) {
            System.out.println("Esta venta es una: 'Venta Frecuente' ;D");
        } else {
            System.out.println("Esta venta es una: 'Venta Superada' :DD");
        }

        obj.close();
        System.out.println("¡Gracias por utilizarme, vuelve pronto!");
    }
}
