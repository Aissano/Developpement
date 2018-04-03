package bobo;

public class Exofor {


	public static void exoFor(){
		for (int i=1; i <= 10000; i++) {
			if (i%47==0) {
				System.out.print("i = "+ i);
			}
			System.out.println("i = "+ i);

		}


	}

	public static String testFor(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat = resultat + c + '\n';
		}

		return  resultat;

	}

	public static int nbrA(String maChaine) {
		int resultat = 0;

		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if( c=='a'){
				resultat++;
			}
		}

		return resultat;

	}

	public static char leplusgrand (String maChaine) {
		char Z = 'a';

		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c > Z) {
				Z = c;
			}

		}
		return Z;
	}

	public static char lepluspetit (String maChaine) {

		char V = 'z';

		// maChaine.length() -> la taille de la listeINT
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c < V) {
				V = c;
			}
		}
		return V;

	}

	public static String sansVoyelle(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
				resultat += c;
			}
		}

		return resultat;
	}

	public static String reverse(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat = c + resultat;
		}

		return resultat;
	}
	public static String reverseEnPartantDeLaFin(String maChaine) {
		String resultat = "";
		// maChaine.length() -> la taille de la liste
		for (int i = maChaine.length() - 1; i >= 0; i--) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			resultat += c;
		}

		return resultat;
	}
	public static int nbrletterPlusGrande(String maChaine) {
		char lettreLaPlusGrande = letterPlusGrande(maChaine);
		int resultat = 0;
		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c == lettreLaPlusGrande) {
				resultat++;
			}
		}

		return resultat;
	}

	public static char letterPlusGrande(String maChaine) {
		char lettreLaPlusPetite = 'a';

		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c > lettreLaPlusPetite) {
				lettreLaPlusPetite = c;
			}
		}

		return lettreLaPlusPetite;
	}

	public static char letterPluspetit(String maChaine) {
		char lettreLaPlusPetite = 'z';

		// maChaine.length() -> la taille de la liste
		for (int i = 0; i < maChaine.length(); i++) {
			// Récupèration du caractère à lire
			char c = maChaine.charAt(i);
			// Action
			if (c < lettreLaPlusPetite) {
				lettreLaPlusPetite = c;
			}
		}

		return lettreLaPlusPetite;
	}


}
