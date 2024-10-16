package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;
    private double bono;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        bono = getBono(); 
        Total = Salario + bono; 
    }

    public int getSubordinados() {
        return Subordinados;
    }

    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }

    public int getProyectos() {
        return Proyectos;
    }

    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    @Override
    public double getBono() {
        bono = (Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() + ", Subordinados = " + Subordinados + ", Proyectos=" + Proyectos + ", Bono=" + bono + ", Total=" + Total + "]";
    }
}
