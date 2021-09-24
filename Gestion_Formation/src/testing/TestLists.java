package testing;

import classes.*;
import classes_lists.*;

public class TestLists {

	public static void main(String[] args) {

		Candidat c = new Candidat(4, "Ayoub Aich", "84000");
		Candidats cs = new Candidats();
		cs.addToList(c);
		cs.showList();
		
		Formateur feur = new Formateur("Aich", "Ayoub", "Testing", "junior");
		Formateurs feurs = new Formateurs();
		feurs.addToList(feur);
		feurs.showList();
		
		Formation fion = new Formation("Gestion de projet", "Aich Ayoub", 150, 15);
		Formations fions = new Formations();
		fions.addToList(fion);
		fions.showList();
		
		Session s = new Session("21/09/20201 09:05:32", "23/09/20201 16:54:04", "Jira", "Aix", "en ligne");
		Sessions ss = new Sessions();
		ss.addToList(s);
		ss.showList();

	}

}
