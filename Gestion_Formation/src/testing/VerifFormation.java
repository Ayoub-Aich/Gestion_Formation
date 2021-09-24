package testing;

public class VerifFormation {
	
	public VerifGenerale vg = new VerifGenerale();
	
	public boolean VerifTitre (String titre) {
		if(titre.matches("[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]+")) {
			return true;
		}
		return false;
	}
	
	public boolean VerifFormateur (String form) {
		if(form.matches("[a-zA-Z0-9]+\\s[a-zA-Z0-9]+")) {
			return true;
		}
		return false;
	}
	
	public boolean VerifPrix (int prix) {
		if(prix >= 100) {
			return true;
		}
		return false;
	}
	
	public boolean VerifNb_heures (int nb_h) {
		if(nb_h >= 10) {
			return true;
		}
		return false;
	}
	
}
