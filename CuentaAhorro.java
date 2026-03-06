package gestioncuentas;

public class CuentaAhorro extends Cuenta {

    public double interes;

    public CuentaAhorro(double interes) {
        this.interes = interes;
    }

    public CuentaAhorro(String titular, double interes) {
        super(titular);
        this.interes = interes;
    }

    public CuentaAhorro() {
        interes = 1.5;
    }

    public void aplicarInteres() {
        setSaldo(getSaldo() + (getSaldo() * interes / 100));
    }
}