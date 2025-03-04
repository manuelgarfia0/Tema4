package crud.ejercicio2;

import java.util.ArrayList;

import parte1.ejercicio4.Articulo;

public class CRUD {

	static private ArrayList<Articulo> ListaArticulo = new ArrayList();

	/**
	 * Imprime lista de articulos.
	 */
	public static void listado() {
		for (Articulo elemento : ListaArticulo) {
			System.out.println(elemento.toString());
		}
	}
	/**
	 * Añade un nuevo articulo a la lista
	 * @param nuevoArticulo nuevo articulo que se va a añadir
	 */
	public static void alta(Articulo nuevoArticulo) {
		ListaArticulo.add(nuevoArticulo);
	}
	
	public static void buscarArticulo(String nombre) {
		Articulo buscado = null;
	}
	
}
