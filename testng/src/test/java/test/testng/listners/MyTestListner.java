package test.testng.listners;

import java.util.Date;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListner implements ITestListener, IInvokedMethodListener,
		ISuiteListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test Finish" + arg0.getName() + "," + new Date());

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Started" + arg0.getName() + "," + new Date());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("Test method Finish" + arg0.getTestMethod().getQualifiedName() + "," + new Date());
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("Test method start" + arg0.getTestMethod().getQualifiedName() + "," + new Date());

	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test suite finish " + arg0.getName() + "," + new Date());

	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test suite start" + arg0.getName() + "," + new Date());

	}

}
