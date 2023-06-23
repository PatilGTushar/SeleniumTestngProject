package Resources;

import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	public static void handleAssertions(String at, String et, String message) {
		
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(at, et, message);
		assertion.assertAll();
		
		
		
	}
	
	
	
	
	
	

}
