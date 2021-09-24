package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFormation {

	public VerifFormation vf;
	
	@Before
	public void beforeCoding()
	{
		this.vf = new VerifFormation();
	}
	
	//////////////////////////////////////
	// VerifFormation
	
	@Test
	public void testTitre()
	{
		assertTrue(vf.VerifTitre("Performances"));
	}
	
	@Test
	public void testFormateur()
	{
		assertTrue(vf.VerifFormateur("Ayoub Aich"));
	}
	
	@Test
	public void testPrix()
	{
		assertTrue(vf.VerifPrix(150));
	}
	
	@Test
	public void testNb_heures()
	{
		assertTrue(vf.VerifNb_heures(15));
	}

	//////////////////////////////////////

}
