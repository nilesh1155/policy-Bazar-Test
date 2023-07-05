package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogInPage {
  

    @FindBy (xpath="//a[text()='Sign in']") private WebElement signInButtonHomePage;
    
    @FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobileNumberField;
    
    @FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPassword;
    
    @FindBy(name="password") private WebElement passwordField;
    
    
    @FindBy(id="login-in-with-password") private WebElement signInButton;
    
    @FindBy(xpath="//div[text()='My Account']") private WebElement myAccount;
    
    @FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
 
    
    //  constructor
    public LogInPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
		

	

                  // Homepage

                   public void clickOnHomePageSignInButton()
                   {
                	   signInButtonHomePage.click();
                	   Reporter.log("click on sign in button",true);
                   }
                   
                   public void enterMobileNum(String mobileno)
                   {
                	   mobileNumberField.sendKeys(mobileno);
                	   
                	   Reporter.log("entered mobile no",true);
                   

                     }
                   
                   public void clickOnSignInWithPassword()
                   {
                	   
                	   signInWithPassword.click();
                	   Reporter.log("select option sign in with password",true);
                   }
                   
                   public void enterPassword(String psw)
                   {
                	   passwordField.sendKeys(psw);
                	   Reporter.log("password is entered",true);
                   }
                   
                   public void clickOnSignInButton()
                   {
                	   signInButton.click();
                	   Reporter.log("sign in successfully done",true);
                   }
                   
                   public void clickOnMyAccount()
                   {
                	   myAccount.click();
                   }
                   
                   public void clickOnMyProfile()
                   {
                	   myProfile.click();
                   }


}




