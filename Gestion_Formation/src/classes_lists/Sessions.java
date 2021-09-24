package classes_lists;

import classes.Candidat;
import classes.Session;
import java.util.ArrayList;

public class Sessions {
	
	public static ArrayList<Session> listesessions = new ArrayList<Session>();

	public static void addToList(Session s)
	{
		listesessions.add(s);	
	}
	
	public static void showList()
	{
		for(Session s: listesessions)
		{
		System.out.println(s.toString());	
		}
	}
	
}