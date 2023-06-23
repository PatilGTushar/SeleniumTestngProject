package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	
	By lastname=By.xpath("//input[@name='UserLastName']");
	
	By jobtitle=By.xpath("//input[@name='UserTitle']");
	
	
	
	
	
	

	
	

	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement firstname() {
	
		  return driver.findElement(firstname);
	}	  
    
	public WebElement lastname() {
		
		  return driver.findElement(lastname);
	}	  
  
	public WebElement jobtitle() {
		
		  return driver.findElement(jobtitle);
	}	  	  
  
	
		  
  
	
	

}
