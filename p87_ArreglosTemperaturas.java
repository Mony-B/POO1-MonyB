/*87_ArrTemp - mostrar, mayor, menor, buscar en un arreglo */
public class p87_ArreglosTemperaturas {
    public static void Mostrar(double[] x) {
        for(int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");
        System.out.println();
    }

    public static double Mayor(double[] x) {
        double m = x[0];
        for(int i = 1; i < x.length; i++)
            if(x[i] > m) m = x[i];
        return m;
    }

    public static double Menor(double[] x) {
        double m = x[0];
        for(int i = 1; i < x.length; i++)
            if(x[i] < m) m = x[i];
        return m;
    }

    public static int Buscar(double[] x, double bus) {
        int pos = -1;
        for(int i = 0; i < x.length; i++) {
            if(x[i] == bus) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        double[] temps = {12.34, 56.22, 56.75, 5.0, 10.0, 10.25, 50.22, 10.0};

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Arreglo de temperaturas:");
        Mostrar(temps);
        System.out.println("El mayor es: " + Mayor(temps));
        System.out.println("El menor es: " + Menor(temps));

        double bus = 10.0;
        int pos = Buscar(temps, bus);

        if (pos != -1)
            System.out.println("Elemento encontrado en la posición: " + pos);
        else
            System.out.println("I Still Haven´t found what I´m looking for");
    }
}
