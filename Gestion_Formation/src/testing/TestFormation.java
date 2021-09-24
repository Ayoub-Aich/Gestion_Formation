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
		assertFalse(vf.VerifTitre("Pe"));
		assertTrue(vf.VerifTitre("Per"));
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
		assertFalse(vf.VerifPrix(99));
		assertTrue(vf.VerifPrix(100));
		assertTrue(vf.VerifPrix(150));
	}
	
	@Test
	public void testNb_heures()
	{
		assertFalse(vf.VerifNb_heures(9));
		assertTrue(vf.VerifNb_heures(10));
		assertTrue(vf.VerifNb_heures(15));
	}

	//////////////////////////////////////

}
