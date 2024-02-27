package cuentas;
public class cuenta1 {

	/**
	 * @author racie
	 * Clase cuenta
	 * */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public cuenta1()
    {
    }

  /**
   * Parametrizacion de la clase cuenta
   * @param nom
   * @param cue
   * @param sal
   * @param tipo
   */
    public cuenta1(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
/**
 * Se obtiene el nombre que tendra la cuenta
 * @return
 */
    public String getNombre() {
		return nombre;
	}
/**
 * devuelve el nombre obtenido en el getter
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Se obtiene la cuenta 
 * @get
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * devuelve la cuenta
 * @return cuenta
 * 
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Obtiene el saldo que tiene la cuenta
 * @return
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * Devuelve la cuenta oobtenida en el metodo getSaldo
 * @return saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Obtiene el tipo de interes de la cuenta
 * @return
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Devuelve el tipo de interes
 * @param tipoInteres
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * @see saldo en cuenta
	 */
	public double estado()
    {
        return saldo;
    }
/**
 * Ingresar cantidad en la cuenta
 * @param cantidad
 * @throws Exception no se puede ingresar cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad a retirar
 * @throws Exception no se puede retirar cantidad negativa y si no hay suficiente cantidad a ingresar
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
