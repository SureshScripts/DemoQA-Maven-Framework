package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sripting extends ReUserMethod{
	
	public void Login() throws InterruptedException, AWTException {
		
		driver.get(obj.getProperty("URL"));
		t(2);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		t(2);
		
		xp("F").click();
		t(1);
		
		xp("PF").click();
		t(1);
		
		xp("XFN").sendKeys(obj.getProperty("FN"));
		xp("XLN").sendKeys(obj.getProperty("LN"));
		xp("XEM").sendKeys(obj.getProperty("EM"));
		t(1);
		
	    WebElement D =	xp("XGR");
		Actions A = new Actions (driver);
		A.moveToElement(D).click().perform();
		t(1);
		
		xp("XMN").sendKeys(obj.getProperty("MN"));
		xp("XDOB").click();
		t(1);
		
		xp("XBY").click();
		xp("XBM").click();
		t(1);
		
		xp("XBD").click();
		t(1);
		
		
		t(3);
		Robot R = new Robot();		
		
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
         t(1);
		 xp("XSUB").click();
		 
		 R.keyPress(KeyEvent.VK_C);
		 R.keyRelease(KeyEvent.VK_C);
		 
		 R.keyPress(KeyEvent.VK_DOWN);
		 R.keyRelease(KeyEvent.VK_DOWN);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_DOWN);
		 R.keyRelease(KeyEvent.VK_DOWN);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_DOWN);
		 R.keyRelease(KeyEvent.VK_DOWN);
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 
		 R.keyPress(KeyEvent.VK_E);
		 R.keyRelease(KeyEvent.VK_E);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement H = xp("XHB");
		 A.moveToElement(H).click().perform();
		
		 WebElement P = xp("XUP");
		 A.moveToElement(P).click().perform();
		 t(2);
		 
		 StringSelection nn = new StringSelection("C:\\Users\\ADMIN\\OneDrive\\Screenshot (2).png");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(nn, null);
		
		 t(2);
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 t(2);
		 
		 xp("XCA").sendKeys(obj.getProperty("CA"));
		 t(1);
		 
		 xp("XST").click();
		
		 R.keyPress(KeyEvent.VK_DOWN);
		 R.keyRelease(KeyEvent.VK_DOWN);
		
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		
		 xp("XSC").click();
		
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		
		 xp("XSM").click();
		
		 System.out.println(xp("XTB"));
		
		 WebElement dd = driver.findElement(By.xpath("//div[@class='table-responsive']"));
		   
          List<WebElement> ddall = dd.findElements(By.tagName("tr"));
          t(2);
          for (int i=1; i<=ddall.size()-1; i++) {
        	  
          String r =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr["+i+"]")).getText();
          
          System.out.println(r);
        }
	}			   
			   
}
  


