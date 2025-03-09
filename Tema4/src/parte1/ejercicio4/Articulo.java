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
	 * Vende una cantidad del artículo, reduciendo el stock disponible.
	 * 
	 * @param cantidad La cantidad a vender. Debe ser positiva y no mayor que el
	 *                 stock disponible.
	 * @return true si la venta fue exitosa, false si no había suficiente stock.
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cantidad > 0 && cantidad <= cuantosQuedan) {
			cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	/**
	 * Almacena una cantidad adicional del artículo, aumentando el stock disponible.
	 * 
	 * @param cantidad La cantidad a almacenar. Debe ser positiva.
	 */
	public void almacenar(int cantidad) {
		if (cantidad > 0) {
			cuantosQuedan += cantidad;
		} else {
			throw new IllegalArgumentException("La cantidad a almacenar debe ser positiva.");
		}
	}

	/**
	 * @return datos del producto
	 */
	public String toString() {
		return getNombre() + " - Precio: " + getPrecio() + "€ - IVA: " + getIVA() + "% - PVP: " + getPVP()
				+ "€ - Quedan: " + getCuantosQuedan();
	}
}