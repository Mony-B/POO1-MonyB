package p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan(String nombreDuenio, String nombreVehiculo, int numPasajeros){
        super(nombreDuenio, nombreVehiculo, numPasajeros);
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil con combustión interna, es un Sedan.");        
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico, es un Sedan. ");        
    }
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carrocería es tres partes, es un Sedan. ");        
    }
    @Override
    public void chasisMonacasco() {
        System.out.println("Es de tipo familiar con chasis monocasco, es un Sedan.");
    }

    
}
