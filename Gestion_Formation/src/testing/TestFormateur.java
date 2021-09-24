package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFormateur {

	public VerifFormateur vf;
	
	@Before
	public void beforeCoding()
	{
		this.vf = new VerifFormateur();
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
		assertFalse(vf.VerifGrade("pro"));
		assertTrue(vf.VerifGrade("junior"));	
	}
	
	//////////////////////////////////////

}
