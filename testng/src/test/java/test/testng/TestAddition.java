package test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddition {

	App ap = new App();

	@Test(dataProvider = "mydp1", dataProviderClass=MyDataProviderClass.class)
	public void testaddition(Integer a, Integer b, Integer c) {
		Assert.assertEquals(Integer.valueOf(ap.add(a, b)), c);
	}

}
