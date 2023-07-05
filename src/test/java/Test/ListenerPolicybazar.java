package Test;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base.Base;
import utility.Utility;



public class ListenerPolicybazar extends Base implements ITestListener
{


	public void onTestStart(ITestResult result) {
	    String testName = result.getName();
	    
	    Reporter.log("this "+testName+" method is started",true);
	}


	public void onTestSuccess(ITestResult result) {
		Reporter.log("this "+result.getName()+" completed successfully",true);
	}


	public void onTestFailure(ITestResult result) {
	
		try {
			
			Utility.getScreenshot( driver, result.getName());
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("this "+result.getName()+" method failed, please try again",true);
	}


	public void onTestSkipped(ITestResult result) {
	
		Reporter.log("this "+result.getName()+" method skipeed due to dependent method",true);
	}

	
}
