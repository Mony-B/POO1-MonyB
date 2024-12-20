package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Sedan miSedan = new Sedan("Mony", "Bochito", 5);
            System.out.println(miSedan.toString());
        
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonacasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
        
        Suv miSuv = new Suv("Mony", "La Perrona", 5);
        System.out.println(miSuv.toString());
        
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }

}
