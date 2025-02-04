package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		// Creamos el objeto y inicializamos sus atributos
		Articulo objeto;
		String nombre = "Aceitunas";
		double precio = 3.5;
		double IVA = 21;
		int cuantosQuedan = 10;

		// Imprimimos los datos
		System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: "
				+ (precio + (precio * (IVA / 100))) + "€ - Quedan: " + cuantosQuedan);

		// Modificamos los datos
		precio = 4;
		cuantosQuedan = 5;

		// Imprimimos los datos
		System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: "
				+ (precio + (precio * (IVA / 100))) + "€ - Quedan: " + cuantosQuedan);
	}
}