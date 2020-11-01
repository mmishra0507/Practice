package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void set()
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinod Khandekar\\Desktop\\SeleniumJars\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();		
			
			 
			driver.get("http://www.google.com");
			 
			driver.quit();
			 
	}
}
