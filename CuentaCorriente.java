package gestioncuentas;

public class CuentaCorriente extends Cuenta {

    public double comision;

    public CuentaCorriente(String titular, double comision) {
        super(titular);
        this.comision = comision;
    }

    public CuentaCorriente() {
        comision = 2.0;
    }

    public void aplicarComision() {
        setSaldo(getSaldo() - comision);
    }
}