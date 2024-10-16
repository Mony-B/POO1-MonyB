package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>(); 
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono(); 
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.Salario + jugador.getBono(); 
        }
        return total;
    }

    public int TotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int TotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Equipo [ Nombre = " + Nombre + ", Liga = " + Liga + 
                           ", Total de jugadores: " + Jugadores.size() +
                           ", Total del bono de los jugadores: " + getTotalBono() + 
                           ", Total de los totales de los jugadores:  " + getTotal() + 
                           ", Cantidad de hombres: " + TotalH() + 
                           ", Cantidad de mujeres: " + TotalM() + "]");
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador.toString());
        }
    }
}
