package testing;

public class VerifFormation {
	
	VerifGenerale vg;
	
	public boolean VerifTitre (String titre) {
		if(titre.matches("[a-zA-Z0-9]3+")) {
			return true;
		}
		return false;
	}
	
	public boolean VerifFormateur (String form) {
		if(vg.VerifAlpha(form)) {
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
