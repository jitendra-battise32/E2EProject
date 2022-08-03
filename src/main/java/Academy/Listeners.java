package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReportNG;
import resources.base;

public class Listeners extends base implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject(); // by using static we have called this method of class ExtentReportNG
	
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); // By using this we can get proper result after executing scripts into parallel mode
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case is Started");
		
		 test = extent.createTest(result.getMethod().getMethodName()); // to get this extent from ExtentReportNG class we declaired that getReportObject() mathod as static and access here by ExtentReportNG.getReportObject(); and stored it into extent 
	     extentTest.set(test);
//result.getMethod().getMethodName(); -  used for dynamic test case.
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("Test Case is Success");
		 
		 extentTest.get().log(Status.PASS, "Test case is passed");
		 
		 
		 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//test.log(Status.FAIL, "Test case is failed");
		
	    extentTest.get().fail(result.getThrowable()); // by using result.getThrowable() we will get all the failure logs
		
		
		WebDriver driver = null; // dummy driver for below driver instance
		
		String testMethodName = result.getMethod().getMethodName();
		
		try
		{
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		
		catch(Exception e) {
			
			
		}
		try {
			
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver), result.getMethod().getMethodName());
			
			//getScreenShotPath(testMethodName, driver);
    	} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Screenshots
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Cases Failed but with Success Percentage");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test Cases is OnStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test Case is Finished");
		
		extent.flush(); // flusshing the extent report
	}


}
