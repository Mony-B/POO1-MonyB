package p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;
    public Circulo() {
    };
    public Circulo(Punto centro, double radio) {
        Radio = radio;
        Centro = centro;
    }
    public Punto getCentro() {return Centro;}
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {return Radio;}
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        return (Radio * Radio) * Math.PI;
    }
    public double getCircunferencia() {
        return (2 * Radio) * Math.PI;
    }
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
}
