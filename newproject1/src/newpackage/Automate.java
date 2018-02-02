package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automate {
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
	
		driver=new FirefoxDriver();
	}
		
		
		@Test(enabled = false)
		public void addLocationTestCase() {
			driver.get("https://www.facebook.com/");
		}
		
		
		@Test
		public void add() {
			driver.get("https://www.google.co.in");
		}
		
	}