package parte1.ejercicio2;

public class Persona {

	private String DNI = "";
	private String nombre = "";
	private String apellidos = "";
	private int edad = 0;

	// Constructor
	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Persona(String DNI, String nombre, String apellidos, int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * 
	 * @return DNI de la persona
	 */
	public String getDNI() {
		return DNI;
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
	 * @return apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos modificado
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * 
	 * @return edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad modificado
	 */
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}
}
