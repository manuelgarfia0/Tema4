package parte3.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// Creo el objeto media
		Media media = new Media();
		// Llamo a la función indicándole unos valores
		double media2 = media.media(4, 5);
		System.out.println(media2);
		// Llamo a la función indicándole unos valores
		double media3 = media.media(3, 7, 31);
		System.out.println(media3);

	}

}
