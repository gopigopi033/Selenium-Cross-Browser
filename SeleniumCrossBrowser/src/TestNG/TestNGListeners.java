package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("start Test");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("50");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("First Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Last Finish");
	}
}
