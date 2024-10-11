package p109_Forma2;

public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getDiametro() {
        return 2 * Radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Radio * Radio;
    }
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio;  
    }
    @Override
    public String getTipo() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return "Círculo [ " + super.toString() + " Radio = " + Radio + "]";
    }
}
