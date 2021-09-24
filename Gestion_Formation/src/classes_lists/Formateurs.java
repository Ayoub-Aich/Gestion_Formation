package classes_lists;

import classes.Formateur;
import java.util.ArrayList;

public class Formateurs {
	
	public static ArrayList<Formateur> listeformateurs = new ArrayList<Formateur>();

	public static void addToList(Formateur f)
	{
		listeformateurs.add(f);	
	}
	
	public static void showList()
	{
		for(Formateur f: listeformateurs)
		{
		System.out.println(f.toString());	
		}
	}
	
}