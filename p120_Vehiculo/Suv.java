package p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombreDuenio, String nombreVehiculo, int numPasajeros){
        super(nombreDuenio, nombreVehiculo, numPasajeros);
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico, es una Suv.");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna, es una Suv.");
    }
    @Override
    public void traccion4x4() {
        System.out.println("Es un autómovil con tracción 4 x 4, es una Suv.");
    }
    @Override
    public void chasisIndependiente() {
        System.out.println("Es un autómovil con chaisis independiente, es una Suv.");
    }

    
}
