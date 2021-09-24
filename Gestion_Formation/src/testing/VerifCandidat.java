package testing;

public class VerifCandidat {
	
	VerifGenerale vg;

	public boolean VerifId (int id) {
		if(id > 0) {
			return true;
		}
		return false;
	}
	
	public boolean VerifName (String name) {
		if(vg.VerifAlpha(name)) {
			return true;
		}
		return false;
	}
	
	public boolean VerifDepartement (String dept) {
		if(dept.length() >= 2 && dept.length() <= 5) {
			try {
		        Integer.parseInt(dept);
		        return true;
		    } catch (final NumberFormatException e) {
		        return false;
		    }
		}
		return false;
	}
	
}
