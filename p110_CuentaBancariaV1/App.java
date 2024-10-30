package p110_CuentaBancariaV1;

import p114_Animal.CuentaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("Probando clase CuentaBancaria");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del primer depósito: " + c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if(rsn) System.out.println("Retiraste: " + cr + ", te quedan: " + c1.getSaldo());
        else System.out.println("¡No tienes ni para los cigarros, ponte a trabajar!");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1" + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mujer = new Cliente("Rocío", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("\nProbando la clase banco");
        Banco mibanco = new Banco("Banco del Bienestar", "Campus Siglo XXI");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        mibanco.agregarCliente(mujer);
        mibanco.agregarCliente(new Cliente("Claudia la Presi", new CuentaBancaria(1000000000)));
        mibanco.getClientes().get(3).getCuenta().retira(900000);
        mibanco.getClientes().get(0).getCuenta().deposita(30000);
        mibanco.getClientes().get(1).getCuenta().deposita(30000);
        mibanco.getClientes().get(2).getCuenta().deposita(30000);

        System.out.println("Los clientes del banco");
        double total = 0;
        for(Cliente cte : mibanco.getClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
        }

        System.out.printf("Total de dinero en el banco %,.2f", total);

    }
}
