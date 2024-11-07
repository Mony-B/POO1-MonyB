import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};

        System.out.print("\033[H\033[2J");
        System.out.flush();

        File arch = new File("deportes.txt");

        if (!arch.exists()) {
            System.out.println("No existe, por lo tanto, lo vamos a crear y escribir datos.");
            try (BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch))) {
                for (String deporte : deportes) {
                    fdeportes.write(deporte + "\n");
                }
                System.out.println("Archivo creado y datos escritos con éxito.");
            } catch (IOException e) {
                System.out.println("Hubo un error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe. Leyendo datos...");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(arch))) {
            String linea;
            System.out.println("\nContenido del archivo deportes.txt:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Hubo un error al leer el archivo: " + e.getMessage());
        }
    }
}
