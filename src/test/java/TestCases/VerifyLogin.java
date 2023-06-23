package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.CommonMethods;
import Resources.Constant;
import Resources.baseclass;
import pageObjectModel.LoginPageObjects;

public class VerifyLogin extends baseclass{
	
	@Test
	public void invalidLogin() throws IOException {
		
		
		
		LoginPageObjects LPO=new LoginPageObjects(driver);
		
		
		LPO.enterUsername().sendKeys(Constant.username);
		LPO.enterPassword().sendKeys(Constant.password);
		LPO.clickLogin().click();
		
		
        
		
		String actualText=LPO.errorText().getText();
		
		String expectedText=Constant.LoginExpectedMessage;
		CommonMethods.handleAssertions(actualText, expectedText, "Error message is not valid");
        
		
		
		
		
		
		
		
	}
	

}
