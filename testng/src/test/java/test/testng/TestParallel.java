package test.testng;

import org.testng.annotations.Test;

public class TestParallel {
	
	@Test(invocationCount=100,threadPoolSize=10, singleThreaded=true)
	public void testparallel()
	{
		System.out.println(Thread.currentThread().getId());		
	}

}
