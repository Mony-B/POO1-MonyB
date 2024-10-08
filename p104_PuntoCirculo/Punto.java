package p104_PuntoCirculo;

public class Punto {
    private int X;
    private int Y;
    public Punto() {
    };
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {return X;}
    public void setX(int x) {
        X = x;
    }
    public int getY() {return Y;}
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto punto) {
        return Math.sqrt(((punto.getX() - X) * (punto.getX() - X)) + ((punto.getY() - Y) * (punto.getY() - Y)));
    }
    public String toString(){
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}