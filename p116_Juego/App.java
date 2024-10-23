package p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados miDados=new JuegoDados();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina miAdivin = new JuegoAdivina();
        miAdivin.iniciar();
        miAdivin.jugar();
        miAdivin.finalizar();
    }
}
