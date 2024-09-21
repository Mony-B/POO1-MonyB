/*p82_InicializaArregloCadenas -  inicializa un arreglo de cadenas*/

public class p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        
        String[] mun=new String[10];
        mun[0]="Apozol";
        mun[1]="Apulco";
        mun[2]="Cañitas";
        mun[3]="Jerez";
        mun[4]="Fresnillo";
        mun[5]="Río Grande";
        mun[6]="Sain Alto";
        mun[7]="Sombrerete";
        mun[8]="Teúl de González Ortega";
        mun[9]="Zacatecas";
        //mun[10]=" Atolinga"; | no existe posición 10

        System.out.print("\033[H\033[2J");
        System.out.println("Primer elemento: "+mun[0]);
        System.out.println("Último elemento: "+mun[9]);
        //System.out.println("Otro: +"mun[10]); | no se puede pq está fuera del rango

        System.out.println("\nTodos los elementos del arreglo con un for en base al índice: ");
        for (int i=0; i<mun.length; i++)
            System.out.print(mun[i]+ ". ");

        System.out.println("\n\nTodos los lementos del arreglo con un for sin índice: ");
        for (String m : mun)
            System.out.print(m + " ");

        System.out.println("\n\nTodo ha terminado...");
    }
}
