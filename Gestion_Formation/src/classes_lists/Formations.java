package classes_lists;

import classes.Formation;
import java.util.ArrayList;

public class Formations {
	
	public static ArrayList<Formation> listeformations = new ArrayList<Formation>();

	public static void addToList(Formation f)
	{
		listeformations.add(f);	
	}
	
	public static void showList()
	{
		for(Formation f: listeformations)
		{
		System.out.println(f.toString());	
		}
	}
	
}