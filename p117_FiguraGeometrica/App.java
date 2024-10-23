package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(100);

        System.out.print("\033[H\033[2J"); 
        System.out.println("Probando círculo...");
        System.out.println(miCirculo);
        miCirculo.ajustar(0.03);
        System.out.println(miCirculo);
    }
}
