package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCandidat {

	public VerifCandidat vc;
	
	@Before
	public void beforeCoding()
	{
		this.vc = new VerifCandidat();
	}
	
	//////////////////////////////////////
	// VerifCandidat
	
	@Test
	public void testId()
	{
		assertTrue(vc.VerifId(4));	
	}
	
	@Test
	public void testName()
	{
		assertTrue(vc.VerifName("Ayoub"));	
	}
	
	@Test
	public void testDepartement()
	{
		assertTrue(vc.VerifDepartement("84000"));	
	}
	
	//////////////////////////////////////

}
