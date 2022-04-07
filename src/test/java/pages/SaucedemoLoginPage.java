package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.SaucedemoBaseClass;
import testcases.SaucedemoLoginTest;

public class SaucedemoLoginPage {

	
	WebDriver driver = SaucedemoBaseClass.driver;
	ExtentTest test = SaucedemoBaseClass.test;

	
	//========================= Web Elements ======================
	
	
	@FindBy(name = "user-name")
	WebElement Username;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "login-button")
	WebElement LoginBtn;

		
	public SaucedemoLoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	//========================= Functions =============================
	
	public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		
		
		Username.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter USerNAme", "Name Entered successfully");
		
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password", "Password Entered successfully");
		
		
		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on Login button", "Login button clicked successfully");	
}

}