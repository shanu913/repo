package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class automation {
@Test
	public void main() {
	System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
	// Create a new instance of the FireFox driver
	WebDriver driver = new FirefoxDriver();

	// Open ToolsQA web site
	String appUrl = "http://www.DemoQA.com";
	driver.get(appUrl);

	// Click on Registration link
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

	// Go back to Home Page
	driver.navigate().back();

	// Go forward to Registration page
	driver.navigate().forward();

	// Go back to Home page
	driver.navigate().to(appUrl);

	// Refresh browser
	driver.navigate().refresh();

	// Close browser
	driver.close();
}
}
