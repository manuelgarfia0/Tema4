package parte2.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// Crear algunos libros
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
		libro1.setEjemplares(10);
		libro1.setGenero(Libro.Genero.Narrativo);

		Libro libro2 = new Libro("1984", "George Orwell", 5, 2, Libro.Genero.Didáctico);

		// Mostrar información de los libros
		System.out.println(libro1);
		System.out.println(libro2);

		// Realizar préstamos
		System.out.println("Préstamo de libro1: " + libro1.prestamo());
		System.out.println("Préstamo de libro2: " + libro2.prestamo());

		// Mostrar información después de los préstamos
		System.out.println(libro1);
		System.out.println(libro2);

		// Realizar devoluciones
		System.out.println("Devolución de libro1: " + libro1.devolucion());
		System.out.println("Devolución de libro2: " + libro2.devolucion());

		// Mostrar información después de las devoluciones
		System.out.println(libro1);
		System.out.println(libro2);

		// Comparar libros
		System.out.println("¿Son iguales libro1 y libro2? " + libro1.equals(libro2));
	}
}