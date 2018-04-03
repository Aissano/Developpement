package testservice;

public class Eleve {
	int note;
	String prenom;
	long id;

	public Eleve(String prenom) {
		this.prenom = prenom;
	}

	public Eleve(int note) {
		this.note = note;
	}

	public Eleve(String prenom, int note, long id) {

		this.prenom = prenom;
		this.note = note;
		this.id = id;
	}

	@Override
	public String toString() {
		return "-" + prenom + "(" + id + ") : " + note;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}