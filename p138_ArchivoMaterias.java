import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        File arch = new File("materias_cursadas.txt");
        ArrayList<String> materias_cursadas = new ArrayList<>();

        if (arch.exists()) {
            System.out.println("El archivo ya existe. Leyendo las materias guardadas:");
            try (BufferedReader fmaterias = new BufferedReader(new FileReader(arch))) {
                String linea;
                while ((linea = fmaterias.readLine()) != null) {
                    System.out.println(linea);
                    materias_cursadas.add(linea);
                }
                System.out.println("\nLas materias cursadas que están en el arreglo:");
                for (String materia : materias_cursadas) {
                    System.out.println(materia);
                }
            } catch (IOException e) {
                System.out.println("Hubo un error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("No existe el archivo. Ingrese las materias cursadas:");
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.print("Materia (escribe 'fin' para terminar): ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("fin")) {
                    break;
                }
                materias_cursadas.add(input);
            }
            scanner.close();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arch))) {
                for (String materia : materias_cursadas) {
                    writer.write(materia + "\n");
                }
                System.out.println("Lista de materias escrita con éxito en el archivo 'materias_cursadas.txt'.");
            } catch (IOException e) {
                System.out.println("Hubo un error al escribir en el archivo: " + e.getMessage());
            }

            System.out.println("\nMaterias leídas del archivo:");
            try (BufferedReader fmaterias = new BufferedReader(new FileReader(arch))) {
                String linea;
                while ((linea = fmaterias.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Hubo un error al leer el archivo: " + e.getMessage());
            }
        }
    }
}
