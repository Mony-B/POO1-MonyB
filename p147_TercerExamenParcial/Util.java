package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Raúl Alejandro", 31, 'H', "Soltero", "Futbolista", 90000));
        datos.add(new Jugador("Benito Martínez", 30, 'H', "Soltero", "Basquetbolista", 150000));
        datos.add(new Jugador("Juan Luis Londoño", 30, 'H', "Casado", "Futbolista", 100000));
        datos.add(new Jugador("María Victoria Ramírez", 27, 'M', "Soltera", "Basquetblista", 700000));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException,
    ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
