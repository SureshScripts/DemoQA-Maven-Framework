package Testing;


import java.awt.AWTException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import BasePack.BaseClass;

public class ExecuteTestCase extends BaseClass {
   
	@Test
   public void mytestcases() throws InterruptedException, AWTException {
		
	   Sripting s = new Sripting ();
	   s.Login();   	
}
	
	  @AfterMethod
	  public void closebrowser() {
		  
		  driver.quit();  
    }
}
