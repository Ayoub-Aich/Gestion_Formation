package testing;

import classes.Session;

public class VerifSession {

	VerifGenerale vg;
	
	public boolean VerifDates (String debut, String fin) {
		if(debut.matches("^\\d{2}/\\d{2}/\\d{4}\\s\\d{2}:\\d{2}:\\d{2}$") && fin.matches("^\\d{2}/\\d{2}/\\d{4}\\s\\d{2}:\\d{2}:\\d{2}$") && debut.compareTo(fin) < 0) {
			return true;
		}
		return false;
	}
	
	public boolean VerifTitre (String titre) {
		if(vg.VerifAlphaNum(titre)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifLieu (String lieu) {
		if(vg.VerifAlpha(lieu)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifMode (String mode) {
		Session ses = new Session();
		for (int i = 0; i < ses.modes.length; i++) {
		    if(mode.matches(ses.modes[i])) {
		    	return true;
		    }
		}
		return false;
	}

	
}
