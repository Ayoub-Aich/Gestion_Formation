package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGenerale {

	public VerifGenerale vg;
	
	@Before
	public void beforeCoding()
	{
		this.vg = new VerifGenerale();
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
		assertTrue(vg.VerifAlphaNum("Ayoub 1994"));
	}
	
	//////////////////////////////////////

}
