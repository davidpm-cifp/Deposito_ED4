package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        // Llamamos al nuevo método, pasando la cuenta y la cantidad
        operativa_cuenta(cuenta1, 2300f);
    }

    /**
     * Método que engloba las operaciones realizadas sobre la cuenta (retiro e ingreso).
     * @param cuenta1  Objeto de tipo CCuenta sobre el que se operará
     * @param cantidad Cantidad (float) que se retirará de la cuenta
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;

        // Consultamos y mostramos el saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Retiramos la cantidad indicada
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        // Ingresamos 695 en la cuenta
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
