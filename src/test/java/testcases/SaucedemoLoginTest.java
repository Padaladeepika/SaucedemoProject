package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.SaucedemoLoginPage;


public class SaucedemoLoginTest extends SaucedemoBaseClass{
	
	

	@Test
	public void LoginFailiureTest() {
		
		//test = report.startTest("LoginFailiureTest");
		
		SaucedemoLoginPage login = new SaucedemoLoginPage();
		login.LoginFunction("xyz@abc.com","Abc@12345");
		
		WebElement Errormsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		
		String ActualMsg = Errormsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
				
		
		AssertJUnit.assertEquals(ActualMsg , ExpMsg);
		
		//report.endTest(test);

	}
	
	@Test
	public void LoginSuccessTest() {
		
		SaucedemoLoginPage login = new SaucedemoLoginPage();
		login.LoginFunction("xyz@abc.com","Abc@12345");		
	}
	
	
	@Test
	@Parameters({"Param1","Param2"})
	public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
		SaucedemoLoginPage login = new SaucedemoLoginPage();
		login.LoginFunction(UserNameVal,PasswordVal);		
		
	}
	
	@Test
	public void ExternalDataTest() {
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		SaucedemoLoginPage login = new SaucedemoLoginPage();
		login.LoginFunction(UserNameVal,PasswordVal);		
	}
	

}




