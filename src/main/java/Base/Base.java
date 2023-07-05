package Base;


import java.io.IOException;

import javax.annotation.Nonnull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.Utility;

public class Base 
{
	// driver and browser setup
	
static protected  WebDriver driver ;

 
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
	 //  driver = new ChromeDriver(opt);
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		
		Reporter.log("launching browser",true);
	}
	
/*	public void launchBrowserUsingProperty() throws IOException
	{
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Utility.dataByUsingproperty("url"));
		
		Reporter.log("launching browser");
	}  */
	
	public  void closeBrowser() throws InterruptedException
	{
	 Utility.timeThread(2000);
		
		Reporter.log("closing browser",true);
		driver.quit();
	}
	
  
}
