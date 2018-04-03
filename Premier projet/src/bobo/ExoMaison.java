package bobo;

public class ExoMaison {
	/** Affiche la largeur, longueur couleur de la maison */
	public static void printMaison(Maison m) {
		System.out.println(m.largeur+":"+m);
	}
	/** Double les tailles de la maison*/
	public static void doubleMaison(Maison m) {
		m.largeur *= 2;
		m.longueur *= 2;
	}

	/** Retourne la maison la plus grande*/
	public static void big(Maison m1, Maison m2) {

	}

	public static Maison bigMaison(Maison[] tab) {
		if (tab == null) {
			return null;
		}
		Maison maisonMax = null;
		for (int i = 0; i < tab.length; i++) {
			if (maisonMax == null) {
				maisonMax = tab[i];
			}
			// Action
			else if (tab[i].largeur * tab[i].longueur > maisonMax.largeur * maisonMax.longueur) {
				maisonMax = tab[i];
			}
		}
		return maisonMax;
	}
}





