package classes;

public class Formation {
	
	private String titre;
	private String formateur;
	private int prix;
	private int nb_heures;
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getFormateur() {
		return formateur;
	}
	
	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public int getNb_heures() {
		return nb_heures;
	}
	
	public void setNb_heures(int nb_heures) {
		this.nb_heures = nb_heures;
	}

	public Formation(String titre, String formateur, int prix, int nb_heures) {
		super();
		this.setTitre(titre);
		this.setFormateur(formateur);
		this.setPrix(prix);
		this.setNb_heures(nb_heures);
	}

}
