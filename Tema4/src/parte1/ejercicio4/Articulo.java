package parte1.ejercicio4;

public class Articulo {
	// Atributos
	private String nombre = "";
	private double precio = 0;
	private double IVA = 21;
	private int cuantosQuedan = 0;

	// Constructor
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA;
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * 
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre modificado
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * 
	 * @return precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio modificado
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * 
	 * @return IVA
	 */
	public double getIVA() {
		return IVA;
	}

	/**
	 * 
	 * @return cantidad restante del producto
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * 
	 * @param cuantosQuedan modificado
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	/**
	 * 
	 * @return PVP
	 */
	public double getPVP() {
		double PVP;
		PVP = getPrecio() + (getPrecio() * (getIVA() / 100));
		return PVP;
	}

	/**
	 * 
	 * @param descuento de lo que esté definido en el método
	 * @return PVP con el descuento implementado
	 */
	public double getPVPDescuento(int descuento) {
		descuento = 1;
		double PVPDescuento;
		PVPDescuento = (getPrecio() + (getPrecio() * (getIVA() / 100))) - descuento;
		return PVPDescuento;
	}

	/**
	 * 
	 * @return true si se han implementado los cambios, si no se queda en false
	 */
	public boolean vender() {
		boolean res = false;
		if (cuantosQuedan < 5) {
			precio = 4.5;
			res = true;
		}
		return res;
	}

	/**
	 * 
	 * @return true si se han implementado los cambios correspondientes, si no se
	 *         queda en false
	 */
	public boolean almacenar() {
		boolean res = false;
		if (cuantosQuedan > 20) {
			precio = 3;
			res = true;
		}
		return res;
	}

	/**
	 * @return datos del producto
	 */
	public String toString() {
		return getNombre() + " - Precio: " + getPrecio() + "€ - IVA: " + getIVA() + "% - PVP: " + getPVP()
				+ "€ - Quedan: " + getCuantosQuedan();
	}
}