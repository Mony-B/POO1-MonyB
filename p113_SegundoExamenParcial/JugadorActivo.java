package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;
    private double bono;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
        bono = getBono(); 
        Total = Salario + bono; 
    }

    @Override
    public double getBono() {
        bono = (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + ", Partidos =" + Partidos + ", Goles = " + Goles + ", Bono = " + bono + ", Total =" + Total + "]";
    }
}
