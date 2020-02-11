package test.testng.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
	int retrycount = 1;

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub

		if (retrycount < 3) {

			retrycount++;
			return true;

		} else {
			return false;
		}
	}

}
