package parte1.ejercicio4;

public class Articulo {
	// Atributos
	String nombre = "";
	double precio = 0;
	double IVA = 21;
	int cuantosQuedan = 0;

	// Constructor
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA;
		this.cuantosQuedan = cuantosQuedan;
	}
}