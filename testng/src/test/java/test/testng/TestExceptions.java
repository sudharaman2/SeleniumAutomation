package test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExceptions {
	
	App a = new App();
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testexception1()
	{
		Assert.assertEquals(a.divide(4, 0), 2);
	}
	
	@Test
	public void testexception2()
	{
		Assert.assertEquals(a.divide(4, 2), 2);
	}

}
