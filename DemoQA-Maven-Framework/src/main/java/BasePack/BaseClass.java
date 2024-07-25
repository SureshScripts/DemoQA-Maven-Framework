package BasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

 
public class BaseClass {
    public static Properties obj;
	public static WebDriver driver;
	
	@BeforeMethod
	  public void openbrowser() throws IOException {
	System.setProperty("WebDriver.Chrome.Driver", "‪C:\\Users\\ADMIN\\eclipse-workspace\\MavenDemoQA\\mydriver\\msedgedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 obj =  new Properties();
	 FileInputStream  F = new FileInputStream("C:\\Users\\ADMIN\\git\\repository\\MavenDemoQA\\src\\data\\java\\myData\\myDataFile");
	 obj.load(F);
	 
	  }
}
