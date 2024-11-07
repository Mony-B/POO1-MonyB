package p139_ArchivoEstudiante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "estudiantes.dat";
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("----- Menú de opciones ---------------");
            System.out.println("Capturar datos .................. [ 1 ]");
            System.out.println("Grabar datos en archivo ......... [ 2 ]");
            System.out.println("Leer datos de archivo ........... [ 3 ]");
            System.out.println("Mostrar datos ................... [ 4 ]");
            System.out.println("Promedio de calificaciones ....... [ 5 ]");
            System.out.println("Promedio de edades .............. [ 6 ]");
            System.out.println("Cantidad de hombres ............. [ 7 ]");
            System.out.println("Cantidad de mujeres ............. [ 8 ]");
            System.out.println("Salir ........................... [ 9 ]");
            System.out.print("Elige opción: ");
            op = obj.nextInt();

            switch (op) {
                case 1:
                    Procesa.capturaDatos(estudiantes);
                    break;

                case 2:
                    try {
                        if (estudiantes.size() != 0) {
                            Procesa.grabarDatos(archivo, estudiantes);
                            System.out.println("\nDatos grabados correctamente.");
                        } else {
                            System.out.println("\nNo hay datos para grabar.");
                        }
                    } catch (IOException e) {
                        System.out.println("\nError al grabar los datos.");
                    }
                    break;

                case 3:
                    try {
                        estudiantes = Procesa.leerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente.");
                    } catch (Exception e) {
                        System.out.println("\nError al leer el archivo.");
                    }
                    break;

                case 4:
                    if (!estudiantes.isEmpty()) {
                        Procesa.mostrarDatos(estudiantes);
                    } else {
                        System.out.println("\nNo hay datos para mostrar.");
                    }
                    break;

                case 5:
                    Procesa.calcularPromedioCalificaciones(estudiantes);
                    break;

                case 6:
                    Procesa.calcularPromedioEdades(estudiantes);
                    break;

                case 7:
                    Procesa.contarHombres(estudiantes);
                    break;

                case 8:
                    Procesa.contarMujeres(estudiantes);
                    break;

                case 9:
                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
            }

            System.out.println("\n<Presiona cualquier tecla para continuar>");
            obj.nextLine();
            obj.nextLine();  

        } while (op != 9);

        obj.close();
    }
}
