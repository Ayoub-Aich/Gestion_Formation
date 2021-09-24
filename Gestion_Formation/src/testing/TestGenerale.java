package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class TestGenerale {

	@Rule
	public VerifGenerale vg;
	
	@Before
	public void beforeCoding()
	{
		vg = new VerifGenerale();
	}
	
	//////////////////////////////////////
	// VerifGenerale
	
	@Test
	public void testAlpha()
	{
		assertTrue(vg.VerifAlpha("Ayoub"));	
	}
	
	@Test
	public void testAlphaNum()
	{
		assertTrue(vg.VerifAlphaNum("Ayoub1994"));	
	}
	
	//////////////////////////////////////

}
