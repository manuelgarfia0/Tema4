package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		// Creamos el objeto y inicializamos sus atributos
		Articulo objeto = new Articulo();
		objeto.nombre = "Aceitunas";
		objeto.precio = 3.5;
		objeto.cuantosQuedan = 10;

		// Imprimimos los datos
		System.out.println(objeto);

		// Modificamos los datos
		objeto.precio = 4;
		objeto.cuantosQuedan = 5;

		// Imprimimos los datos
		System.out.println(objeto);
	}
}