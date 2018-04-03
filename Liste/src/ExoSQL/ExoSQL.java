package ExoSQL;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ExoSQL {

	public static String URL = "jdbc:sqlite:C:/Users/JAVA/Documents/SQLiteStudio/maBase";
	private final static String QUERY_SAVE_ELEVES = "INSERT INTO Eleve (prenom, note) VALUES (?, ?);";
	private final static String QUERY_FIND_ELEVES = "SELECT * FROM eleve ";

	public static void main(String[] args) throws Exception {
		EleveBean eleveBean = new EleveBean();
		eleveBean.setNote(12);
		eleveBean.setPrenom("Toto");




		ajouterEleve(eleveBean);

		ArrayList<EleveBean> eleveBeans = getEleves();
		for (EleveBean e : eleveBeans) {
			System.out.println(e);
		}

	}

	public static void ajouterEleve(EleveBean eleve) {
		//TODO Ajout de l'�l�ve en base
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL); // La connexion
			stmt = con.prepareStatement(QUERY_SAVE_ELEVES);
			// Remplir la requ�te
			stmt.setString(1, eleve.getPrenom());
			stmt.setInt(2, eleve.getNote());
			// Lancer la requ�te
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// On ferme la connexion
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static ArrayList<EleveBean> getEleves() throws Exception{
		ArrayList<EleveBean> eleveBeans = new ArrayList<>();
		//TODO R�cup�rer la liste des �l�ves dans la base


		Connection con = null;
		Statement stmt = null;

		try {

			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_ELEVES);
			while (rset.next()) {
				EleveBean eleve = rsetToEleve(rset);
				eleveBeans.add(eleve);
			}
		}
		catch (final SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return eleveBeans;
	}

	private static EleveBean rsetToEleve(ResultSet rset) {
		// TODO Auto-generated method stub


		return null;

	}
}