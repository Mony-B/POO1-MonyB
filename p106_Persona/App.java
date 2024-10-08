package p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Pérez", "Sierra de Cerdos 12", 41);
        Persona p2 = new Persona("María", "Lo de Vega", 25);
        
        System.out.print("\033[H\033[2J");
        System.out.flush(); 

        Estudiante e1=new Estudiante("Carlos Castañeda", "Sierra Nevada", 25, "Ing de Software", 2000, 700 );
        Estudiante e2= new Estudiante("Miguel Angel", "Av. Insurgentes", 25, "Arquitectura", 2000, 300 );

        Apoyo a1= new Apoyo("Brayan Pablo", "Av. Mexico", 25, "Jardinero", "Preparatoria", 1500);
        Apoyo a2= new Apoyo("McClovin", "Lomas del Pedregal", 45, "Secretario", "Lic. Contabilidad", 2500);

        System.out.println("Personas");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println();
        System.out.println("Estudiantes");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 instanceof Persona);
        
        System.out.println();
        System.out.println("Personal apoyo");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 instanceof Persona);
    }
}
