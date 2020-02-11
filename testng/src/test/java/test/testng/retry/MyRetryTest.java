package test.testng.retry;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = MyTransformer.class)
public class MyRetryTest {

	// @Test(retryAnalyzer=MyRetry.class)
	@Test
	public void mytest1() {
		Assert.assertTrue(false);
	}

	@Test
	public void mytest2() {

		Assert.assertTrue(false);

	}

}
