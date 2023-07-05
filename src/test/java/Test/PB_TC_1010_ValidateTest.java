package Test;



import org.testng.annotations.Test;

import Base.Base;
import utility.Utility;
import pom.LogInPage;
import pom.MyAccountPage;

import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ListenerPolicybazar.class)
		public class PB_TC_1010_ValidateTest extends Base
		{
	//	WebDriver driver;
		
		LogInPage login;
		
		MyAccountPage mypage;
		
	
	  
		@BeforeClass
		public void launchPolicyBrowser() throws InterruptedException
		{
			launchBrowser();
	
	
			login= new LogInPage(driver);
			
			mypage=new MyAccountPage(driver);           
			
		
		
		}
		
		@BeforeMethod
		public void logIntoPoliciBazar() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Utility.timeThread(1000);
			login.clickOnHomePageSignInButton();
			Utility.timeThread(1000);
			
			login.enterMobileNum(Utility.dataByUsingproperty("mobileno"));
			Utility.timeThread(1000);
			
			login.clickOnSignInWithPassword();
			Utility.timeThread(1000);
			
			login.enterPassword(Utility.dataByUsingproperty("psw"));
			Utility.timeThread(1000);
			
			login.clickOnSignInButton();
			Utility.timeThread(2000);
			
			login.clickOnMyAccount();
			Utility.timeThread(2000);
		
			login.clickOnMyProfile();
			Utility.timeThread(1000);
			
			//new tab open we need to switch on new tab
			
		          Set<String> id = driver.getWindowHandles();
		          List <String>li=new ArrayList<String>(id);
		          
		          driver.switchTo().window(li.get(1));
		          
		          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		          
		          
		        }
		
		@Test
		public  void validateUserName() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Utility.timeThread(2000);
			String expectedUsername= Utility.dataByUsingproperty("name");
					
			String ActualNameGet=mypage.getActualuserName();
			Assert.assertEquals( ActualNameGet, expectedUsername," actual and expected name is not match taste case is failed ");
			
			
			
		
		}
		
			
		   
		@AfterMethod
		public void logOutFromPolicy() throws InterruptedException
		{
			Utility.timeThread(1000);
			mypage.clickOnLogOutButton();
		}
		
		@AfterClass
		 public void closePolicyBrowser() throws InterruptedException
		 {
			
			
	closeBrowser();
			
			
			
		 }
	}




