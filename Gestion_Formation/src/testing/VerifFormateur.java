package testing;

import classes.Formateur;

public class VerifFormateur {

	public VerifGenerale vg = new VerifGenerale();
	
	public boolean VerifNom(String nom) {
		if(vg.VerifAlpha(nom)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifPrenom(String prenom) {
		if(vg.VerifAlpha(prenom)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifSpecialite(String special) {
		if(vg.VerifAlphaNum(special)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifGrade (String grade) {
		Formateur form = new Formateur();
		for (int i = 0; i < form.grades.length; i++) {
		    if(grade.matches(form.grades[i])) {
		    	return true;
		    }
		}
		return false;
	}
	
}
