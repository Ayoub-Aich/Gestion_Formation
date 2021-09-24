package classes;

public class Formateur {
	
	private String nom;
	private String prenom;
	private String specialite;
	private String grade;
	public String[] grades = {"junior" ,"senior", "expert"};
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Formateur(String nom, String prenom, String specialite, String grade) {
		super();
		this.setNom(prenom);
		this.setPrenom(prenom);
		this.setSpecialite(specialite);
		this.setGrade(grade);
	}

	public Formateur() {
		super();
	}

}
