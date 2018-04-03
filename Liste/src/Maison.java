import java.util.Random;

public class Maison {

	public int largeur = 20;
	public int longueur = 10;
	public String  couleur= null;





	public Maison() {

	}

	public Maison(boolean random) {
		super();
		if(random) {
			largeur = new Random().nextInt(100);
			longueur = new Random().nextInt(100);
		}
	}

	public static void doubleMaison(Maison m) {
		m.largeur *= 2;
		m.longueur *= 2;
	}

	public static void Maisonbig(Maison m1, Maison m2) {


	}
	/*public return_type name() {

	}*/
}
