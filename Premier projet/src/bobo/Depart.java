package bobo;

public class Depart {

	public static void main(String[] args) {

		/*// TODO Auto-generated method stub
		System.out.println("hello word");
		double resultat= Exo.photocopie (10);
		System.out.println("Resultat=" + resultat);

		Exo.exo2(10);
		Exo.sub(16, 6);
		int somme=Exo. multiply(22, 6, 5);
		System.out.println("Resultat=" + somme);
		System.out.println("Resultat=" + Exo.max(12, 14, 20));
		int[]tab= new int[5];
		ArrarUtils.fillTab(tab);
		ArrarUtils.printTab(tab);

		Maison maison = new Maison();
		ExoMaison.printMaison(maison);*/

		DeBean d = new DeBean();

		d.lancer();

		System.out.println(" Randomvalue=" + d.getvalue ());

		GobeletBean g = new GobeletBean();
		g.lancer();
		System.out.println(g.getScore());

		JoueurDean j = new JoueurDean("samuel");
		System.out.println(	j.getPrenom());
		j.lancer();
		System.out.println(j.getScorePartie());


		PartieDebean p = new PartieDebean("bob1","bob2");
		p.ajouterTour();
		p.ajouterTour();
		p.getJoueuractif().lancer();
		System.out.println(p.getJoueuractif().getPrenom());


		//


	}
}



