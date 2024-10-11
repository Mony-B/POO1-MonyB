package p108_Vehiculo;
//Mony B.

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Compacto n1= new Compacto("JHMCM82633C123456", "BYD", 2024, 365450.00, 4, 4);
        Compacto n2= new Compacto("1HGCM82633A654321", "Tesla", 2023, 2598742, 6, 4);

        Camioneta c1= new Camioneta("2FMDK39C58BA12345", "GMC", 2024, 3505405.00, 937, 2);

        System.out.println("Vehículo Compacto:");
        System.out.println(n1);

        System.out.println();
        System.out.println("Camioneta:");
        System.out.println(c1);
        
        vehiculos.add(n1);
        vehiculos.add(c1);
        vehiculos.add(n2);
        vehiculos.add(new Camioneta("1C4RJEBG3FC123456", "Ford", 2020, 1506973.0, 550, 2));

        System.out.println();
        System.out.println("Todos los vehículos dentro del arreglo:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println();
        System.out.println("Precios de todos los vehículos:");
        double precioTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            precioTotal += vehiculo.getPrecio();
        }
        System.out.println();
        System.out.println("La suma de los precios de todos los vehículos es:");
        System.out.println(precioTotal);
    }

}
