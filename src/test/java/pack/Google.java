package pack;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {

	@Test
	
	public void openGoogle()
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.bk.com");
	}
}
