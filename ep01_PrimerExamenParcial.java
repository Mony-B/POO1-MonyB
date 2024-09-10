/*ep01_PrimerExamenParcial - Mónica del Rocío Gutiérrez R. 3A  */

import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        char tipoPart, op, resp='s';
        String nombre;
        int edad, alumCount = 0, docCount = 0, trabCount = 0, hombCount = 0, mujCount = 0, rechCount = 0;
        int totalEdad = 0;
        double totalRecaudado = 0, totalAlumRecaudado = 0, totalDocRecaudado = 0, totalTrabRecaudado = 0;

        System.out.println("Curso de técnicas avanzadas de programación. \n '''Universidad Benito Martínez.'''");

        do {
            System.out.println("Ingresa tu nombre: ");
            nombre = obj.nextLine();

            System.out.println("¿Cuál es tu edad?");
            edad = obj.nextInt();
            obj.nextLine();

            if (edad < 23) {
                System.out.println("No cumples con la edad requerida (23), lo sentimos.");
                rechCount++;
                continue;
            }

            System.out.println("¿Cuál es tu sexo? ");
            System.out.println("[F] Femenino");
            System.out.println("[M] Masculino");
            op = Character.toUpperCase(obj.next().charAt(0));
            obj.nextLine();

            if (op == 'M') {
                hombCount++;
            } else if (op == 'F') {
                mujCount++;
            }

            System.out.println("¿Qué tipo de participante eres? (Escribe la inicial correspondiente.)");
            System.out.println("[A] Alumno");
            System.out.println("[D] Docente");
            System.out.println("[T] Trabajador");
            tipoPart = Character.toUpperCase(obj.next().charAt(0));
            obj.nextLine();

            System.out.println("¡Bienvenid@! Tus datos son:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Sexo: " + (op == 'M' ? "Masculino" : "Femenino"));
            System.out.println("Tipo de Participante: " + tipoPart);

            switch (tipoPart) {
                case 'A':
                    System.out.println("Pagarás un total de $40");
                    alumCount++;
                    totalAlumRecaudado += 40;
                    break;
                case 'D':
                    System.out.println("Pagarás un total de $60");
                    docCount++;
                    totalDocRecaudado += 60;
                    break;
                case 'T':
                    System.out.println("Pagarás un total de $80");
                    trabCount++;
                    totalTrabRecaudado += 80;
                    break;
                default:
                    System.out.println("Tipo de participante no válido.");
                    continue;
            }

            totalEdad += edad;

            System.out.println("¿Deseas ingresar otro participante? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            obj.nextLine();

        } while (resp == 'S');

        int partCount = alumCount + docCount + trabCount;
        totalRecaudado = totalAlumRecaudado + totalDocRecaudado + totalTrabRecaudado;
        double promedioEdad = (partCount > 0) ? (double) totalEdad / partCount : 0;

        System.out.println("\nResumen del curso:");
        System.out.println("Total de participantes: " + partCount);
        System.out.println("Alumnos: " + alumCount);
        System.out.println("Docentes: " + docCount);
        System.out.println("Trabajadores: " + trabCount);
        System.out.println("Hombres: " + hombCount);
        System.out.println("Mujeres: " + mujCount);
        System.out.println("Promedio de edad de los participantes: " + promedioEdad);
        System.out.println("Rechazados por edad: " + rechCount);

        System.out.println("Total dinero recaudado de Alumnos: $" + totalAlumRecaudado);
        System.out.println("Total dinero recaudado de Docentes: $" + totalDocRecaudado);
        System.out.println("Total dinero recaudado de Trabajadores: $" + totalTrabRecaudado);
        System.out.println("Total dinero recaudado en general: $" + totalRecaudado);

        if (totalRecaudado < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (totalRecaudado >= 50 && totalRecaudado <= 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        obj.close();
    }
}
