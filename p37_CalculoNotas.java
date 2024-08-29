/*p37_CalcNot - Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir un mensaje de acuerdo con el promedio obtenido:
• >0 y <= 6 Quedas reprobado
• >6 a <=7 Pasas de panzazo
• >7 y <=8 Muy bien, pues mejorar
• >8 y <=9 Excelente sigue así
• >9 y <=10 Perfecto tu esfuerzo valió la pena */


import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        float c1, c2, c3, c4, c5, cal;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Calcularé el promedio de 5 calificaciones que ingresarás.");
        System.out.println("Dame las cinco calificaciones, separadas por enter, por favor.");
        c1 = obj.nextFloat();
        c2 = obj.nextFloat();
        c3 = obj.nextFloat();
        c4 = obj.nextFloat();
        c5 = obj.nextFloat();

        cal = (c1 + c2 + c3 + c4 + c5) / 5;

        if (cal > 0 && cal <= 6)
        System.out.println("Tu calificación es de "+ cal +"\nQuedas reprobado :()");
        if (cal > 6 && cal <= 7)
        System.out.println("Tu calificación es de "+ cal +"\nPasas de panzazo :0");
        if (cal > 7 && cal <= 8)
        System.out.println("Tu calificación es de "+ cal +"\nMuy bien, puedes mejorar ;)");
        if (cal > 8 && cal <=9)
        System.out.println("Tu calificación es de "+ cal +"\nExcelente, sigue así :D");
        if (cal > 9 && cal <=10)
        System.out.println("Tu calificación es de "+ cal +"\n¡Perfecto! Tu esfuerzo valió la pena :D ");

        System.out.println("\nGracias por usarme, bye...");

        
    }
    
}

