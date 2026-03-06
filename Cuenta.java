package gestioncuentas;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    public Cuenta(String titular) {
        this.titular = titular;

    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
    public double calcularSaldoFinal() {
        return saldo;
    }

}
