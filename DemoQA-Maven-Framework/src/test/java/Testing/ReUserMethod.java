package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReUserMethod extends ExecuteTestCase {
	
	public WebElement xp(String a) {
		return driver.findElement(By.xpath(obj.getProperty(a)));
	}
	
	
	public void t(int d) throws InterruptedException {
		
		int x = d * 1000;
		Thread.sleep(x);
	}

}
