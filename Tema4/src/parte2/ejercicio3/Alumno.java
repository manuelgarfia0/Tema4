package parte2.ejercicio3;

public class Alumno {

	private String nombre;
	private double media;

	// Constructores
	/**
	 * 
	 * @param nombre nombre del alumno
	 * @param media  nota media del alumno
	 */
	public Alumno(String nombre, double media) {
		if (!nombre.equals("") && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	/**
	 * 
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return nota media del alumno
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * 
	 * @param media nota media del alumno
	 */
	public void setMedia(double media) {
		this.media = media;
	}

	/**
	 * @return Información del alumno
	 */
	public String toString() {
		return nombre + " " + media;
	}

	/**
	 * @return true si los alumnos son iguales, false si no
	 */
	public boolean equals(Object obj) {
		boolean res = false;
		Alumno alumno2 = (Alumno) obj;
		if (nombre.equals(alumno2.nombre)) {
			res = true;
		}
		return res;
	}
}
