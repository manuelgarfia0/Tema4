package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		// Creamos el objeto y inicializamos sus atributos
		Articulo objeto;
		String nombre = "Aceitunas";
		double precio = 3.5;
		double IVA = 21;
		int cuantosQuedan = 10;

		objeto = new Articulo(nombre, precio, IVA, cuantosQuedan);

		// Imprimimos los datos
		System.out.println(objeto);

		// Modificamos los datos
		objeto.setPrecio(4);
		objeto.setCuantosQuedan(5);

		objeto = new Articulo(nombre, precio, IVA, cuantosQuedan);

		// Imprimimos los datos
		System.out.println(objeto);
	}
}