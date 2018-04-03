package bobo;

public class Exo {

	static double photocopie(int nbPhoto) {
		if (nbPhoto <= 10) {
			return nbPhoto * 0.1;
		} else if (nbPhoto <= 30) {
			return 1 + (nbPhoto - 10) * 0.09;
		} else {
			return 2.8 + (nbPhoto - 30) * 0.08;
		}

	}

	static void exos1() {

		int i = 7;
		int j = 3;
		int divEntiere = i / j;
		int reste = i % j;
		double divClassique = i / (double) j;
		double somme = divClassique + divEntiere + +reste;

		System.out.println("La division entière : " + divEntiere);
		System.out.println("La reste : " + reste);
		System.out.println("La division classique : " + divClassique);
		System.out.println("La somme des 3 : " + somme);

		System.out.println("La somme : " + i + j);

	}

	static void exo2(int a) {
		System.out.println(" le resultat: " + (a + 5));
	}

	static void sub(int a, int b) {
		System.out.println("le resultat : " + (a - b));
	}

	public static int multiply(int a, int b, int c) {
		return (b * c) + a;

	}

	public static int max(int a, int b, int c) {

		if (a>b && a>c) {
			return a;

		} else if (b>c && b>a) {
			return b;

		} else {
			return c;
		}


	}



}






