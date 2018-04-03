package bobo;

public class PartieDebean {




	public static final int NBR_TOUR = 10;

	public static final int SCORE_A_ATTEINDRE = 7;

	private JoueurDean j1, j2;
	private int tourEncours;
	private JoueurDean joueurActif;

	public PartieDebean(String nom,String nom2) {
		j1 = new JoueurDean(nom);
		j2 = new JoueurDean(nom2);
		tourEncours = 1;
	}


	public void ajouterTour() {
		if (joueurActif==null || joueurActif == j2) {
			joueurActif = j1;
		} else{
			joueurActif = j2;
			tourEncours++;
		}



	}
	public boolean isTermine() {
		return NBR_TOUR <tourEncours;
	}



	public JoueurDean getJ1() {
		return j1;
	}

	public void setJ1(JoueurDean j1) {
		this.j1 = j1;
	}

	public JoueurDean getJ2() {
		return j2;
	}

	public void setJ2(JoueurDean j2) {
		this.j2 = j2;
	}

	public int getPartieEncours() {
		return tourEncours;
	}

	public void setPartieEncours(int partieEncours) {
		tourEncours = partieEncours;
	}

	public JoueurDean getJoueuractif() {
		return joueurActif;
	}

	public void setJoueuractif(JoueurDean joueurActif) {
		this.joueurActif = joueurActif;
	}











}

