package p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Banco mibanco = new Banco("Banco del Bienestar","Av México 120, La Florida ");

        // Datos del banco
        System.out.println(mibanco.getNombre());
        System.out.println(mibanco.getDomicilio());
        System.out.println();

        // Agregamos clientes al banco
        mibanco.agregarCliente(new Cliente("Carlos Fuente"));
        mibanco.agregarCliente(new Cliente("Juan De La Fuente"));
        mibanco.agregarCliente(new Cliente("Rene Mayorga"));
        mibanco.agregarCliente(new Cliente("Maria Vazques"));
        System.out.println("\n>>> Los clientes del banco son:\n");
        mibanco.reporte();

        // Agrgamos cuentas de diferentes tipos de cuentas a los clientes del Banco
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.10));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.20));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000,500));
        mibanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500,500));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000,600));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000,0.40));
        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son:\n");
        mibanco.reporte();

        // Retirmaos y depositamos a las diferentes cuentas de alguos clientes
        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        mibanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        System.out.println("\n>>> Los clientes con sus cuentas y saldos después de los movimeintos son: \n");
        mibanco.reporte();

        // Reporte de clientes del banco y el saldo de sus cuentas, después del calculo de intereses 
        mibanco.calcularInteres();
        System.out.println("\n>>> Los clientes con sus cuentas y saldos después de calcular intereses: \n");
        mibanco.reporte();

        System.out.println(mibanco);

    }
}