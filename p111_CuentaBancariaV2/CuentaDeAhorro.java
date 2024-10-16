package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria{
    private double tasainteres;

    public CuentaDeAhorro(double saldo, double tasainteres) {
        super(saldo); // invoca al constructor de la clase base 
        this.tasainteres = tasainteres;
    }

    public void calcularInteres() {
        saldo += saldo * tasainteres;
    }
    public boolean retira(double cantidad) {
        if ( saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        else return false;
    }
    public String toString() {
        return "CuentaDeAhorro [saldo = " + super.getSaldo() + ", tasa interes = " + tasainteres + "]";
    }
}