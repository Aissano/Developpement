import java.util.ArrayList;

public class CollectionUtils {
	public static void main(String[] args){
		ArrayList<Maison> maisonArrayList= new ArrayList<>();
		fillList(maisonArrayList, 10);
		printList(maisonArrayList);
		printList(maisonArrayList);
		Maison max = getMax(maisonArrayList);
		if (max != null) {
			System.out.println("max = " + max.largeur + "x" + max.longueur);
		} else {
			System.out.println("max � nulle");
		}
		supImpaire(maisonArrayList);
		printList(maisonArrayList);
	}

	/**Remplis la liste de maison de largeur et longueur al�atoires */
	public static void fillList(ArrayList<Maison> maisonArrayList, int
			nbMaison) {

		for (int i = 0; i < nbMaison; i++) {
			Maison maison = new Maison(true);
			maisonArrayList.add(maison);

		}
	}

	/** Affiche la liste dans la console */
	public static void printList(ArrayList<Maison> maisonArrayList) {

		/*

		for (int i = 0; i < maisonArrayList.size(); i++) {
			System.out.println(maisonArrayList.get(i).largeur+":" +maisonArrayList.get(i).longueur);

		}
		 */
		for (Maison maison : maisonArrayList) {
			System.out.println(maison.largeur+":" + maison.longueur + "");

		}
	}
	/** Affiche et retourne la maison la plus grande */
	public static Maison getMax(ArrayList<Maison> maisonArrayList) {


		for (int i = 0; i < maisonArrayList.size(); i++) {
			Maison maison = new Maison();
			/*maisonMax = maison();
			if (maisonMax == null) {
				maisonMax = maisonArrayList.get(maison.largeur*":" + maison.longueur * "");{*/

		}
		return null;
	}




	/** Retire les maisons de surface impaire*/
	public static void supImpaire (ArrayList<Maison> maisonArrayList) {}
}