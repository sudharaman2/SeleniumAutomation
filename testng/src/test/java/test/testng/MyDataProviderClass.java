package test.testng;

import org.testng.annotations.DataProvider;

public class MyDataProviderClass {
	
	@DataProvider(name="mydp1")
	public Integer[][] addtestdata()
	{
		Integer x[][] =  {{3,4,7},{4,5,11},{4,5,9}};
		return x;
	}

}
