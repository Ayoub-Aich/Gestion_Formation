package classes;

public class Candidat {

	private int id;
	private String name;
	private String departement;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartement() {
		return departement;
	}
	
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public Candidat(int id, String name, String departement) {
		super();
		this.setId(id);
		this.setName(name);
		this.setDepartement(departement);
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", name=" + name + ", departement=" + departement + "]";
	}
	
}
