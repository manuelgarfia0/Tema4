package parte2.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// Creo los alumnos
		Alumno alumno1 = new Alumno("Pepe Pérez", 7.6);
		Alumno alumno2 = new Alumno("Paco Suarez", 9);

		// Mostrar información de los alumnos
		System.out.println(alumno1);
		System.out.println(alumno2);

		System.out.println("Pepe sube nota y Paco prefiere que le llamen Francisco");

		// Modifico la información de los alumnos
		alumno1.setMedia(8);
		alumno2.setNombre("Francisco Suarez");

		// Vuelvo a mostrar la información de los alumnos
		System.out.println(alumno1);
		System.out.println(alumno2);

		// Comprobamos que los dos alumnos no sean iguales
		System.out.println(alumno1.equals(alumno2));

	}

}
