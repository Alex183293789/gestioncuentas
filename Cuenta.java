package gestioncuentas;
/**
 * Clase que representa una cuenta bancaria.
 * Permite ingresar y retirar dinero y consultar el saldo.
 *
 * @author TuNombre
 * @version 1.0
 */

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    public Cuenta(String titular) {
        this.titular = titular;

    }
    /**
     * Muestra los datos de la cuenta por pantalla.
     */

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
    /**
     * Retira dinero de la cuenta controlando que exista saldo suficiente.
     *
     * @param cantidad  {double} cantidad de dinero a retirar
     * @return true {boolean}si la operación se realiza correctamente, false en caso contrario
     */
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
