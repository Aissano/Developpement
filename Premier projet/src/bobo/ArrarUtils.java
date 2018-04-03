package bobo;

import java.util.Random;

public class ArrarUtils {




	public static void fillTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(100);// Chiffre Aléatoire de 0 à 99

		}
	}

	public static void printTab(int[] tab) {

		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " " );

		}
		System.out.println();
	}

	public static int getMax(int[] tab)  {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < tab.length; i++) {
			int c = tab[i];
			// Action
			if (c > max) {
				max = c;
			}
		}

		return max;
	}



	public static int[] plusPetit(int[] tab1, int[] tab2) {
		for (int i = 0; i < tab1.length || i < tab2.length; i++) {

			if (i >= tab1.length) {
				return tab2;
			} else if (i >= tab2.length) {
				return tab1;
			} else if (tab1[i] < tab2[i]) {
				return tab1;
			} else if (tab1[i] > tab2[i]) {
				return tab2;
			}
		}
		return null;
	}

	public static int[] fusionTrier(int[] tab1, int[] tab2) {
		int[] tab3 = new int[tab1.length + tab2.length];
		int iTab1 = 0, iTab2 = 0;
		for (int iTab3 = 0; iTab3 < tab3.length; iTab3++) {

			if (iTab1 >= tab1.length) {
				tab3[iTab3] = tab2[iTab2];
				iTab2++;
			} else if (iTab2 >= tab2.length) {
				tab3[iTab3] = tab1[iTab1];
				iTab1++;
			} else if (tab1[iTab1] <= tab2[iTab2]) {
				tab3[iTab3] = tab1[iTab1];
				iTab1++;
			} else if (tab1[iTab1] > tab2[iTab2]) {
				tab3[iTab3] = tab2[iTab2];
				iTab2++;
			}
		}
		return tab3;

	}

	public static int[] fusion(int[] tab1, int[] tab2) {
		int[] resultat = new int[tab1.length + tab2.length];
		for (int i = 0; i < tab1.length; i++) {
			resultat[i] = tab1[i];
		}

		for (int i = 0; i < tab2.length; i++) {
			resultat[tab1.length + i] = tab2[i];
		}

		return resultat;

	}

	public static int nbMaxOpti(int[] tab) {
		int max = Integer.MIN_VALUE;
		int nbOccu = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				nbOccu++;
			} else if (tab[i] > max) {
				nbOccu = 1;
				max = tab[i];
			}
		}
		return nbOccu;
	}

	public static int nbMax(int[] tab) {
		int max = getMax(tab);
		int resultat = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				resultat++;
			}
		}
		return resultat;
	}

	public static void supMoyenne(int[] tab) {
		double moyenne = moyenne(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= moyenne) {
				System.out.print(tab[i] + " ");
			}
		}
		System.out.println();
	}

	public static double moyenne(int[] tab) {
		return (double) somme(tab) / tab.length;
	}

	public static int somme(int[] tab) {
		int resultat = 0;
		for (int i = 0; i < tab.length; i++) {
			resultat += tab[i];
		}
		return resultat;
	}





	public static int[] exoTableau(int max) {
		int[] monTab = new int[max];
		// Création d'un tableau d'entier de taille 'max'
		for (int i = 0; i < monTab.length; i++) {
			monTab[i] = new Random().nextInt(100);
			// Chiffre Aléatoire de 0 à 99
		}
		return monTab;
	}




}




