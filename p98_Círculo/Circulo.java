package p98_Circulo;

public class Circulo {
    private double radio;

    public Circulo() {}

    public Circulo(double radioParam) {
        radio = radioParam; 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radioParam) {
        radio = radioParam;  
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Círculo [Radio = " + radio + "]"; 
    }
}
