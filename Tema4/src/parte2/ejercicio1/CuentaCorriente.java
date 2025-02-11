package parte2.ejercicio1;

public class CuentaCorriente {
	// Variables
	private String DNI;
	private String nombre;
	private double saldo;
	private String nacionalidad;
	public static final String nacionalidadEspañola = "Española";
	public static final String nacionalidadExtranjera = "Extranjera";

	/**
	 * 
	 * @param DNI
	 * @param saldoInicial
	 */
	// Constructores
	public CuentaCorriente(String DNI, double saldoInicial) {
		this.DNI = DNI;
		this.saldo = saldoInicial;
	}

	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param saldoInicial
	 */
	public CuentaCorriente(String DNI, String nombre, double saldoInicial) {
		this.DNI = DNI;
		this.saldo = saldoInicial;
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param saldoInicial
	 * @param nacionalidad
	 */
	public CuentaCorriente(String DNI, String nombre, double saldoInicial, String nacionalidad) {
		this.DNI = DNI;
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
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * 
	 * @return DNI
	 */
	public String getDNI() {
		return DNI;
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
		return "Cuenta (" + "DNI = " + DNI + ", " + "nombre = " + nombre + ", " + "saldo = " + saldo + ", "
				+ "nacionalidad = " + nacionalidad + ")";
	}

	/**
	 * @return true si las dos cuentas tienen mismo DNI y nombre, false si son
	 *         diferentes
	 */
	public boolean equals(Object obj) {
		// 1. Si el objeto es la misma cuenta, son iguales.
		if (this == obj) {
			return true;
		}

		// 2. Si el objeto es nulo, no son iguales.
		if (obj == null) {
			return false;
		}

		// 3. Si el objeto no es una CuentaCorriente, no son iguales.
		if (!(obj instanceof CuentaCorriente)) {
			return false;
		}

		// 4. Convertimos el objeto a una CuentaCorriente.
		CuentaCorriente otraCuenta = (CuentaCorriente) obj;

		// 5. Comparamos el DNI y el nombre de las dos cuentas.
		boolean mismoDNI = this.DNI.equals(otraCuenta.DNI);
		boolean mismoNombre = this.nombre.equals(otraCuenta.nombre);

		// 6. Si ambos son iguales, las cuentas son iguales.
		return mismoDNI && mismoNombre;
	}
}
