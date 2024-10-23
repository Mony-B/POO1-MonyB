package p120_Vehiculo;

public class Maquina {
    private String nombreDuenio;
    private String nombreVehiculo;
    private int numPasajeros;

    public Maquina(String nombreDuenio, String nombreVehiculo, int numPasajeros) {
        this.nombreDuenio = nombreDuenio;
        this.nombreVehiculo = nombreVehiculo;
        this.numPasajeros = numPasajeros;
    }
    @Override
    public String toString() {
        return "Máquina [Propietario: " + nombreDuenio + ", Nombre: " + nombreVehiculo + ", Número de Pasajeros: "
                + numPasajeros + "]";
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void repostar(){
        System.out.println("Reposteando...");
    }
    public void arrancar(){
        System.out.println("Arrancando...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }

    
}
