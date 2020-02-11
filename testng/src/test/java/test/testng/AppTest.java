package test.testng;

import jdk.nashorn.internal.ir.annotations.Ignore;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	
static ExtentTest test;
static ExtentReports report;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("userdir  :: "+System.getProperty("user.dir"));
		 report = new  ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");

	}
	
	public void aftersuite()
	{
		report.endTest(test);
		report.flush();
	}

	App a = new App();

	@Test(groups = "regression")
	public void testAdd() {
		Assert.assertEquals(a.add(4, 4), 8);
		test.log(LogStatus.PASS, "test passed");
	}

	@Test(groups = "sanity", enabled = true)
	public void testMethod2() {
		Assert.assertFalse(true);
		test.log(LogStatus.PASS, "test passed");
	}

	@Test(groups = "regression")
	public void testMethod3() {
		Assert.assertFalse(true);
		test.log(LogStatus.PASS, "test passed");
	}

	@Test(dependsOnGroups = "sanity", alwaysRun = true)
	public void testmethod4() {
		test.log(LogStatus.PASS, "test passed");

	}

	@Ignore
	@Test(dependsOnMethods = "testMethod3", description = "test description")
	public void testmethod5() {
		test.log(LogStatus.PASS, "test passed");

	}

}
