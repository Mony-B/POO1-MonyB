import java.io.*;

public class p133_Archivos2 {
    public static void main(String[] args) {
        String[] ciudades={"Zacatecas", "Fresnillo", "Cd. Guzmán", "Aguascalientes", "Río Grande", "Guadalajara"};

        System.out.print("\033[H\033[2J");
        System.out.flush();

        File arch = new File("ciudades.txt");

        if (! arch.exists()){
            System.out.println("No existe, por lo tanto, lo vamos a crear.");
            try {
               BufferedWriter fciudades =  new BufferedWriter(new FileWriter(arch));
               for (String ciudad: ciudades){
                fciudades.write(ciudad + "\n");
               }
               fciudades.close();
               System.out.println("Archivo creado con éxito.");
            } catch (Exception e) {
                System.out.println("Hubo un error al manipular el archivo." + e.getMessage());
            }
        } else
            System.out.println("El archivo ya existe...");

    }
}
