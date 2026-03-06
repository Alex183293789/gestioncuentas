package gestioncuentas;
/**
 * Clase principal que ejecuta el programa de prueba
 * para las cuentas bancarias.
 *
 * @author TuNombre
 * @version 1.0
 */

public class Principal {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Ana López");
        cuenta.setTitular("Laura Martínez");
        cuenta.setSaldo(500);

        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.setTitular("Pedro Gómez");
        cuentaAhorro.setSaldo(1000);

        CuentaCorriente cc = new CuentaCorriente();
        cc.setTitular("Ana López");
        cc.setSaldo(800);

        // Operaciones hechas directamente sobre el saldo (mal diseño intencionado)
        cuenta.setSaldo(cuenta.getSaldo() + 200 - 50);

        cuentaAhorro.setSaldo(cuentaAhorro.getSaldo() + 300);
        cuentaAhorro.aplicarInteres();

        cc.setSaldo(cc.getSaldo() - 100);
        cc.aplicarComision();

        System.out.println("---- Cuenta normal ----");
        cuenta.mostrarDatos();

        System.out.println("---- Cuenta ahorro ----");
        cuentaAhorro.mostrarDatos();

        System.out.println("---- Cuenta corriente ----");
        cc.mostrarDatos();
    }
}