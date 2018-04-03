package bobo;

public class Controleur {

	public static void main(String[] args) {
		lancer();
	}

	public static void lancer() {
		PartieDebean p = new PartieDebean("bob1", "bo2");
		// on lance la partie en entier
		for (int i = 0; i < PartieDebean.NBR_TOUR; i++) {
			p.getJ1().lancer();

			if (p.getJ1().getGobelet().getScore() >= PartieDebean.SCORE_A_ATTEINDRE) {
				p.getJ1().ajouter1Pt();
			}

			p.getJ2().lancer();
			if (p.getJ2().getGobelet().getScore() >= PartieDebean.SCORE_A_ATTEINDRE) {
				p.getJ2().ajouter1Pt();
			}

			p.ajouterTour();
		}
		// L'affichage du r�sulat

		if (p.getJ1().getScorePartie() > p.getJ2().getScorePartie()) {
			System.out.println("J1 a gagn�");
		} else if (p.getJ1().getScorePartie() < p.getJ2().getScorePartie()) {
			System.out.println("J2 a gagn�");
		} else {
			System.out.println("Egalit�");
		}

		System.out.println("Score  : " + p.getJ1().getScorePartie() + " - " + p.getJ2().getScorePartie());

	}

}