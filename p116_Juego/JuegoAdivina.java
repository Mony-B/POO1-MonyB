package p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner teclado;
    public JuegoAdivina(){
        teclado = new Scanner(System.in);
}
    public void iniciar() {
        num = 1 + (int) (Math.random()*100);
    }
    public void jugar(){
        int num;
        do {
            System.out.println("Dame un número entre 1 y 100: "); num = teclado.nextInt();
            if(this.num < num) System.out.println("Mas abajo ..");
            else if(this.num > num) System.out.println("Mas arriba ..");
            intentos++;
        }while(this.num != num);

    }
    @Override
    public void finalizar() {
        System.out.println("\n" + this.num + " era el número !!!. Ganaste después de " + intentos + " intentos!");
        
    }
    

    
}
