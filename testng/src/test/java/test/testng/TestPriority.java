package test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriority {
	
//	@Test(priority=1)
//	public void test1()
//	{
//		System.out.println("in test 1");
//	}
//	
//	@Test(priority=100)
//	public void test2()
//	{
//		System.out.println("in test 2");
//	}
//	
//	@Test(priority=100)
//	public void test3()
//	{
//		System.out.println("in test 3");
//	}
	
	@Test(successPercentage=0)
	public void test4()
	{
		Assert.assertFalse(true);
	}

}
