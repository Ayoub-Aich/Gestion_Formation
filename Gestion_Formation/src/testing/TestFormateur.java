package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class TestFormateur {

	@Rule
	public VerifFormateur vf;
	
	@Before
	public void beforeCoding()
	{
		vf = new VerifFormateur();
	}
	
	//////////////////////////////////////
	// VerifFormateur
	
	@Test
	public void testNom()
	{
		assertTrue(vf.VerifNom("Aich"));	
	}
	
	@Test
	public void testPrenom()
	{
		assertTrue(vf.VerifNom("Ayoub"));	
	}
	
	@Test
	public void testSpecialite()
	{
		assertTrue(vf.VerifSpecialite("Java11"));
	}
	
	@Test
	public void testGrade()
	{
		assertTrue(vf.VerifGrade("junior"));	
	}
	
	//////////////////////////////////////

}
