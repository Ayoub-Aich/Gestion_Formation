package classes;

public class Session {

	private String debut;
	private String fin;
	private String titre_formation;
	private String lieu;
	private String mode;
	public String[] modes = {"présentiel", "en ligne"};
	
	public String getDebut() {
		return debut;
	}
	
	public void setDebut(String debut) {
		this.debut = debut;
	}
	
	public String getFin() {
		return fin;
	}
	
	public void setFin(String fin) {
		this.fin = fin;
	}
	
	public String getTitre_formation() {
		return titre_formation;
	}
	
	public void setTitre_formation(String titre_formation) {
		this.titre_formation = titre_formation;
	}
	
	public String getLieu() {
		return lieu;
	}
	
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}

	public Session(String debut, String fin, String titre_formation, String lieu, String mode) {
		super();
		this.setDebut(debut);
		this.setFin(fin);
		this.setTitre_formation(titre_formation);
		this.setLieu(lieu);
		this.setMode(mode);
	}

	public Session() {
		super();
	}
	
}
