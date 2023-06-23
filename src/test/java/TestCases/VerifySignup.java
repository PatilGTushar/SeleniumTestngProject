package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Constant;
import Resources.baseclass;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignUpPageObjects;

public class VerifySignup extends baseclass {
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		
		
		LoginPageObjects LPO=new LoginPageObjects(driver);
		
		LPO.ClickonTryForFree().click();
		
		 SignUpPageObjects SPO=new  SignUpPageObjects(driver);
		 
		 Thread.sleep(5000);
		SPO.firstname().sendKeys(Constant.firstname);
		SPO.lastname().sendKeys(Constant.lastname);
		SPO.jobtitle().sendKeys(Constant.jobtitle);
		
		
		
		
}
	
	
		
	
	
	
	
	

}
