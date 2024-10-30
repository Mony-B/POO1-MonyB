package p127_MiExcepcion;

//Para creadr ntra. propia excepción, heredamos la clase excepción. Creamos un constructor, que pase el mensaje de error

public class FueraDeRango extends Exception {
    public FueraDeRango(String error){
        super(error);
    }    
}

