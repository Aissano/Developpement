package bobo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI {

	private JFrame frame;
	private JTextField textScoreDe1;
	private JTextField textScoreDe2;
	private JTextField textScore1;
	private JTextField textScore2;
	JLabel lblJoueur1 ;
	JLabel lblJoueur2;
	JLabel lblnbrTour;
	JLabel lblScoreJoueur1;
	JLabel lblScoreJoueur2;
	JButton btnLancerJoueur1;
	JButton btnLancerJoueur2;
	JButton btnRestar;
	JLabel lblDe1 ;
	JLabel lblDe2;
	De DePipe;
	JCheckBox chckTricheurJ1, chckTricheurJ2;



	PartieDebean partie;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		partie = new PartieDebean("bob", "samuel");




		initialize();
		refreshSceen();

	}
	private void refreshSceen (){
		lblJoueur1.setText( partie.getJ1().getPrenom());
		lblJoueur2.setText( partie.getJ2().getPrenom());
		textScore1.setText(""+ partie.getJ1().getScorePartie() );
		textScore2.setText(""+ partie.getJ2().getScorePartie() );
		lblnbrTour.setText(""+ partie.getPartieEncours());
		btnLancerJoueur1.setVisible(true);
		/*btnRestar.*/


		// Si la partie est termin�e
		if (partie.isTermine()) {
			btnLancerJoueur1.setVisible(false);
			btnLancerJoueur2.setVisible(false);
			btnRestar.setVisible(true);
		} else {

			btnRestar.setVisible(false);
			// La visibilit� des boutons en fonction du joueur actif
			if (partie.getJoueuractif() == partie.getJ1()) {
				btnLancerJoueur1.setVisible(true);
				btnLancerJoueur2.setVisible(false);
				// Afficher les d�s de J2

			} else {

				btnLancerJoueur1.setVisible(false);
				btnLancerJoueur2.setVisible(true);

				// Afficher les d�s de J1
			}
		}
	}

	/*******************
	 */

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}



	/*if (joueurActif==null || joueurActif == j2) {
			joueurActif = j1;
		} else{
			joueurActif = j2;
			tourEncours++;
		}*/
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblJoueur1 = new JLabel("Joueur1");
		lblJoueur1.setBounds(46, 41, 55, 14);
		frame.getContentPane().add(lblJoueur1);

		lblJoueur2 = new JLabel("Joueur2");
		lblJoueur2.setBounds(304, 41, 46, 14);
		frame.getContentPane().add(lblJoueur2);

		lblnbrTour = new JLabel("Tour :3");
		lblnbrTour.setBounds(197, 41, 46, 14);
		frame.getContentPane().add(lblnbrTour);

		lblScoreJoueur1 = new JLabel("Score");
		lblScoreJoueur1.setBounds(10, 83, 46, 14);
		frame.getContentPane().add(lblScoreJoueur1);

		btnLancerJoueur1 = new JButton("lancer");
		btnLancerJoueur1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				partie.getJ1().lancer();

				if (partie.getJ1().getGobelet().getScore() >= PartieDebean.SCORE_A_ATTEINDRE) {
					partie.getJ1().ajouter1Pt();

				}
				partie.ajouterTour();
				refreshSceen();


			}
		});
		btnLancerJoueur1.setBounds(37, 152, 89, 23);
		frame.getContentPane().add(btnLancerJoueur1);

		lblDe1 = new JLabel("     De 1");
		lblDe1.setBounds(140, 103, 46, 14);
		frame.getContentPane().add(lblDe1);

		lblDe2 = new JLabel("      De 2");
		lblDe2.setBounds(258, 103, 46, 14);
		frame.getContentPane().add(lblDe2);

		btnLancerJoueur2 = new JButton("lancer");
		btnLancerJoueur2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				partie.getJ2().lancer();
				if (partie.getJ2().getGobelet().getScore() >= PartieDebean.SCORE_A_ATTEINDRE) {
					partie.getJ2().ajouter1Pt();
				}
				partie.ajouterTour();
				refreshSceen();
			}
		});
		btnLancerJoueur2.setBounds(345, 152, 89, 23);
		frame.getContentPane().add(btnLancerJoueur2);

		btnRestar = new JButton("restart");
		btnRestar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRestar.setBounds(194, 228, 89, 23);
		frame.getContentPane().add(btnRestar);

		textScoreDe1 = new JTextField();
		textScoreDe1.setBounds(136, 121, 86, 48);
		frame.getContentPane().add(textScoreDe1);
		textScoreDe1.setColumns(10);

		textScoreDe2 = new JTextField();
		textScoreDe2.setBounds(234, 121, 86, 48);
		frame.getContentPane().add(textScoreDe2);
		textScoreDe2.setColumns(10);

		textScore1 = new JTextField();
		textScore1.setBounds(66, 80, 69, 20);
		frame.getContentPane().add(textScore1);
		textScore1.setColumns(10);

		lblScoreJoueur2 = new JLabel("Score");
		lblScoreJoueur2.setBounds(290, 83, 46, 14);
		frame.getContentPane().add(lblScoreJoueur2);

		textScore2 = new JTextField();
		textScore2.setColumns(10);
		textScore2.setBounds(355, 80, 69, 20);
		frame.getContentPane().add(textScore2);

		JCheckBox chckTricheurJ1 = new JCheckBox("Tricheur");
		chckTricheurJ1.setBounds(10, 215, 97, 23);
		frame.getContentPane().add(chckTricheurJ1);

		JCheckBox chcktricheurJ2 = new JCheckBox("Tricheur");
		chcktricheurJ2.setBounds(337, 201, 97, 23);
		frame.getContentPane().add(chcktricheurJ2);
	}
}
