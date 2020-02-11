package test.testng.reporting;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class MyReporter implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
		for(ISuite suite: arg1)
		{
			
			System.out.println("i am in suite ::  "+suite.getName());
			Map<String, ISuiteResult> results = suite.getResults();
			Collection<ISuiteResult> resultkeys = results.values();
			
			for(ISuiteResult result:resultkeys)
			{
				System.out.println("i am in testcontext :: "+result.getTestContext().getName());
				ITestContext testcontext = result.getTestContext();
				IResultMap mysuccessmap = testcontext.getPassedTests();
				Collection<ITestNGMethod> successmethodds = mysuccessmap.getAllMethods();
				for(ITestNGMethod successmethod : successmethodds)
				{
					System.out.println("passed method name :: "+successmethod.getMethodName());
				}
				
				IResultMap myfailedmap = testcontext.getFailedTests();
				
			}
			
			
		}
		
	}

}
