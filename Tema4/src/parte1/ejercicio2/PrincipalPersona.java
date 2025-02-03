package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declaro dos personas
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		// Preguntamos por los datos de ambas personas
		System.out.println("Nombre de la primera persona: ");
		p1.nombre = scanner.nextLine();

		System.out.println("Apellidos de la primera persona: ");
		p1.apellidos = scanner.nextLine();

		System.out.println("Edad de la primera persona: ");
		p1.edad = scanner.nextInt();
		// Limpio escaner
		scanner.nextLine();

		System.out.println("DNI de la primera persona: ");
		p1.DNI = scanner.nextLine();

		System.out.println("Nombre de la segunda persona: ");
		p2.nombre = scanner.nextLine();

		System.out.println("Apellidos de la segunda persona: ");
		p2.apellidos = scanner.nextLine();

		System.out.println("Edad de la segunda persona: ");
		p2.edad = scanner.nextInt();
		// Limpio escaner
		scanner.nextLine();
		System.out.println("DNI de la segunda persona: ");
		p2.DNI = scanner.nextLine();

		// Si es menor de edad
		if (p1.edad < 18) {
			System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " no es mayor de edad");
		} else {
			System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " es mayor de edad");
		}

		if (p2.edad < 18) {
			System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " no es mayor de edad");
		} else {
			System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " es mayor de edad");
		}

	}
}
