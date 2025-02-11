package cuentas;

/**
 * Clase que representa una cuenta bancaria. Permite consultar el saldo,
 * ingresar y retirar dinero, así como acceder y modificar sus atributos.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta.
     */
    private String cuenta;

    /**
     * Saldo disponible en la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     * Inicializa una cuenta sin datos.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para crear una cuenta con datos iniciales.
     *
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta.
     * @param sal  Saldo inicial.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad a ingresar (debe ser positiva).
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar (debe ser positiva).
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés aplicado a la cuenta.
     *
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés Nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
