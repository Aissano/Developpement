package bobo;

public class Eleve {

	int note;
	String prenom;
	long id;

	public Eleve() {
		super();
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
