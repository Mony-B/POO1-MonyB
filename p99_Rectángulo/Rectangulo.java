package p99_Rectángulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;

    public Rectangulo() {
    }
    public Rectangulo(float largoParam, float anchoParam){
        Largo = largoParam;
        Ancho = anchoParam;
    }
    public float getLargo() {
        return Largo;
    }
    public void setLargo(float largo) {
        Largo = largo;
    }
    public float getAncho() {
        return Ancho;
    }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }
    public float getArea(){
        return Largo * Ancho;
    }
    public float getPerimetro(){
        return 2 *(Ancho + Largo);
    }
    @Override
    public String toString() {
        return "Rectángulo [Largo = " + Largo + ", Ancho = " + Ancho + "]";
    }
    
}
