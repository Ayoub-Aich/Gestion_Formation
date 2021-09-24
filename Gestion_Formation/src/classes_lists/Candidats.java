package classes_lists;

import classes.Candidat;
import java.util.ArrayList;

public class Candidats {
	
	public static ArrayList<Candidat> listecandidats = new ArrayList<Candidat>();
	
	public static void addToList(Candidat c)
	{
		listecandidats.add(c);	
	}
	
	public static void showList()
	{
		for(Candidat c: listecandidats)
		{
		System.out.println(c.toString());	
		}
	}

}
