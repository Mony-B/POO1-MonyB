
package p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Banco () {
        clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this(); // Invoca alconstructor vacío de la misma clase 
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente ) {
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public double getTotal() {
        double total = 0;
        for (Cliente cliente : clientes) {
            total += cliente.getTotal();
        }
        return total; 
    }
    public void calcularInteres () {
        for (Cliente cliente : clientes) {
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                if (cuenta instanceof CuentaDeAhorro) {
                    ((CuentaDeAhorro)cuenta).calcularInteres(); // Hacemos casting para hacer a la
                     //cuenta una cuenta de ahorro
                }
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void reporte() {
        for (Cliente cliente : clientes) {
            System.out.println("> " + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                System.out.println(cuenta.toString());
            }
            if (cliente.getCuentas().size()==0) System.out.println();
        }
    }
    public String toString() {
        return "\nBanco [Nombre=" + nombre + ", Domicilio=" + domicilio + ", Clientes=" + clientes.size() + " Total= " + this.getTotal() + "]";
    }
}
