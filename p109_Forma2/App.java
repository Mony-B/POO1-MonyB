package p109_Forma2; //Mony B.

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    ArrayList<Forma> formas = new ArrayList<>();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        

        Circulo c1= new Circulo("Azul", false, 20);
        Rectangulo r1=new Rectangulo("Rosa", true, 2.5, 5);
        Circulo c2= new Circulo("Rojo", false, 55.5  );
        Rectangulo r2= new Rectangulo("Negro", true, 8, 4);

        formas.add(c1);
        formas.add(r1);
        formas.add(c2);
        formas.add(r2);

       System.out.println("Figuras:\n");
        for (Forma forma : formas) {
            System.out.println(forma);
        }
        System.out.println("\n-----------------------------------------------------------------------------");

        System.out.println("\nÁreas y Perímetros:\n");
        for (Forma forma : formas) {
            System.out.println("La forma es: " + forma.getTipo());
            System.out.printf("Área: %.2f\n", forma.getArea());
            System.out.printf("Perímetro: %.2f\n", forma.getPerimetro());
            System.out.println();
        }  
        



    }
}
