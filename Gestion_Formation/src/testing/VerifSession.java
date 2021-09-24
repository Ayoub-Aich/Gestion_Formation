package testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import classes.Session;

public class VerifSession {

	VerifGenerale vg = new VerifGenerale();
	
	public boolean VerifDates (String debut, String fin) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
		
		try{
		    format.parse(debut);
		}catch(ParseException e){
		    return false;
		}
		
		try{
		    format.parse(fin);
		}catch(ParseException e){
		    return false;
		}
		
		if(debut.compareTo(fin) < 0 && fin.compareTo(timeStamp) < 0) {
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
