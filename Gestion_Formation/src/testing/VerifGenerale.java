package testing;

public class VerifGenerale {
	
	public boolean VerifAlpha (String alpha) {
		if(alpha.matches("[a-zA-Z]+")) {
			return true;
		}
		return false;
	}
	
	public boolean VerifAlphaNum (String alphanum) {
		if(alphanum.matches("[a-zA-Z]+")) {
			return true;
		}
		return false;
	}

}
