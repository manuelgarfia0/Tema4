package parte2.ejercicio2;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	private Genero genero;

	enum Genero {
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}

	/**
	 * 
	 * @param titulo titulo del libro
	 * @param autor  autor del libro
	 */
	// Constructores
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	/**
	 * 
	 * @param titulo              titulo del libro
	 * @param autor               autor del libro
	 * @param ejemplares          numero de ejemplares del libro
	 * @param ejemplaresPrestados numero de ejemplares del libro prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * 
	 * @param titulo              titulo del libro
	 * @param autor               autor del libro
	 * @param ejemplares          numero de ejemplares del libro
	 * @param ejemplaresPrestados numero de ejemplares del libro prestados
	 * @param genero              genero del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.genero = genero;
	}

	// Getters y Setters
	/**
	 * 
	 * @return titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * 
	 * @param titulo titulo del libro
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * 
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * 
	 * @param autor autor del libro
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * 
	 * @return numero de ejemplares del libro
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * 
	 * @param ejemplares numero de ejemplares del libro
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * 
	 * @return numero de ejemplares del libro prestados
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * 
	 * @param ejemplaresPrestados numero de ejemplares del libro prestados
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * 
	 * @return genero del libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * 
	 * @param genero genero del libro
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * 
	 * @return true si se ha podido realizar un préstamo, false si no
	 */
	// Método para realizar un préstamo
	public boolean prestamo() {
		if (ejemplaresPrestados < ejemplares) {
			ejemplaresPrestados++;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return true si tienes libros prestados para devolver, false si no
	 */
	// Método para realizar una devolución
	public boolean devolucion() {
		if (ejemplaresPrestados > 0) {
			ejemplaresPrestados--;
			return true;
		}
		return false;
	}

	// Método toString para mostrar la información del libro
	/**
	 * @return Informacion del libro
	 */
	public String toString() {
		return "Libro: " + "Título = " + titulo + ". Autor = " + autor + ". Número de ejemplares = " + ejemplares
				+ ". Número de ejemplares prestados = " + ejemplaresPrestados + ". Género = " + genero;
	}

	// Método equals para comparar dos libros
	/**
	 * @return true si los libros son iguales, false si no
	 */
	public boolean equals(Object obj) {
		boolean res = false;
		Libro libro2 = (Libro) obj;
		if (titulo.equals(libro2.titulo) && autor.equals(libro2.autor)) {
			res = true;
		}
		return res;
	}
}