package parte2.ejercicio1;

public class CuentaCorriente {
	// Variables
	private String dni;
	private String nombre;
	private double saldo;
	private Nacionalidad nacionalidad;

	enum Nacionalidad {
		Español, Extranjero
	}

	/**
	 * 
	 * @param DNI
	 * @param saldoInicial
	 */
	// Constructores
	public CuentaCorriente(String dni, double saldoInicial) {
		this.dni = dni;
		this.saldo = saldoInicial;
	}

	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param saldoInicial
	 */
	public CuentaCorriente(String dni, String nombre, double saldoInicial) {
		this.dni = dni;
		this.saldo = saldoInicial;
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldoInicial
	 * @param nacionalidad
	 */
	public CuentaCorriente(String dni, String nombre, double saldoInicial, Nacionalidad nacionalidad) {
		this.dni = dni;
		this.saldo = saldoInicial;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * 
	 * @return saldo
	 */
	// Getters y setters
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @return nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public Nacionalidad setNacionalidad(Nacionalidad nacionalidad) {
		return this.nacionalidad = nacionalidad;
	}

	/**
	 * 
	 * @return DNI
	 */
	public String getDNI() {
		return dni;
	}

	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param cantidad
	 * @return true si puede sacar dinero, falso si no
	 */
	public boolean sacarDinero(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad) {
			saldo -= cantidad;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param cantidad
	 * @return true si ingresa alguna cantidad de dinero, false si no
	 */
	// Método para ingresar dinero
	public boolean ingresarDinero(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			return true;
		}
		return false;
	}

	/**
	 * @return Información de la cuenta
	 */
	// Método toString
	public String toString() {
		return "Cuenta (" + "DNI = " + dni + ", " + "nombre = " + nombre + ", " + "saldo = " + saldo + ", "
				+ "nacionalidad = " + nacionalidad + ")";
	}

	/**
	 * @return true si las dos cuentas tienen mismo DNI y nombre, false si son
	 *         diferentes
	 */
	public boolean equals(Object obj) {
		boolean res = false;
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		if (dni.equals(cuenta2.dni) && nombre.equals(cuenta2.nombre)) {
			res = true;
		}
		return res;
	}
}
