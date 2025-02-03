package parte1.ejercicio4;

public class Articulo {
	// Atributos
	String nombre;
	double precio;
	final double IVA = 21;
	int cuantosQuedan;
	
	// Overrides
	public String toString() {
		return nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: " + (precio + (precio * (IVA / 100)))
				+ "€ - Quedan: " + cuantosQuedan;
	}
}