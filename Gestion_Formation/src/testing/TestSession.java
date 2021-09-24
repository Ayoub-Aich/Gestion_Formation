package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class TestSession {

	@Rule
	public VerifSession vs;
	
	@Before
	public void beforeCoding()
	{
		vs = new VerifSession();
	}
	
	//////////////////////////////////////
	// VerifSession
	
	@Test
	public void testDates()
	{
		assertTrue(vs.VerifDates("05/07/20201 09:00:00", "24/09/2021 17:00:00"));	
	}
	
	@Test
	public void testTitre()
	{
		assertTrue(vs.VerifTitre("POEI Testeur"));	
	}
	@Test
	public void testLieu()
	{
		assertTrue(vs.VerifLieu("Aix"));	
	}
	@Test
	public void testMode()
	{
		assertTrue(vs.VerifMode("en ligne"));	
	}
	
	//////////////////////////////////////

}