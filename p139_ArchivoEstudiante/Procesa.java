package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {

    public static void capturaDatos(ArrayList<Estudiante> estudiantes) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos del Estudiante (deja el nombre vacío para terminar): ");

        while (true) {
            Estudiante estudiante = new Estudiante("", 0, 0.0f, "");

            System.out.print("\nNombre: ");
            estudiante.setNombre(obj.nextLine());
            if (estudiante.getNombre().isEmpty()) break;

            System.out.print("Edad: ");
            estudiante.setEdad(obj.nextInt());

            System.out.print("Promedio: ");
            estudiante.setPromedio(obj.nextFloat());
            obj.nextLine();  // Limpiar el buffer

            System.out.print("Sexo (M/F): ");
            estudiante.setSexo(obj.nextLine());

            estudiantes.add(estudiante);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> estudiantes) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fdatos = new ObjectOutputStream(arch);
        fdatos.writeObject(estudiantes);
        fdatos.close();
    }

    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fdatos = new ObjectInputStream(arch);
        estudiantes = (ArrayList<Estudiante>) fdatos.readObject();
        fdatos.close();

        return estudiantes;
    }

    public static void mostrarDatos(ArrayList<Estudiante> estudiantes) {
        System.out.println("\nDatos de los estudiantes: ");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void calcularPromedioCalificaciones(ArrayList<Estudiante> estudiantes) {
        float total = 0;
        for (Estudiante estudiante : estudiantes) {
            total += estudiante.getPromedio();
        }
        System.out.println("Promedio de calificaciones: " + (total / estudiantes.size()));
    }

    public static void calcularPromedioEdades(ArrayList<Estudiante> estudiantes) {
        int total = 0;
        for (Estudiante estudiante : estudiantes) {
            total += estudiante.getEdad();
        }
        System.out.println("Promedio de edades: " + (total / estudiantes.size()));
    }

    public static void contarHombres(ArrayList<Estudiante> estudiantes) {
        int hombres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo().equalsIgnoreCase("M")) {
                hombres++;
            }
        }
        System.out.println("Cantidad de hombres: " + hombres);
    }

    public static void contarMujeres(ArrayList<Estudiante> estudiantes) {
        int mujeres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo().equalsIgnoreCase("F")) {
                mujeres++;
            }
        }
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}
