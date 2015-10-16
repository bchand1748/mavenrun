package pack;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	
		
	@Test
	
	public void openGoogle()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkbc011\\Desktop\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://www.bk.com");
	    driver.quit();
	     
	//adding a comments 
	}



}
