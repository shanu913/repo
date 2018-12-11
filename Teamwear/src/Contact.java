
//importing package of its respective external classes

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Creating class
public class Contact {

	// Crating main method
	public static void main(String args[]) {

		// Gecko Driver is the link between your tests in Selenium and the Firefox
		// browser.
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");

		// Instantiating objects and variables
		WebDriver driver = new FirefoxDriver();

		// Setting a wait of 30 seconds to sync with the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// getting the URL by get method
		driver.get("http://gorillaclients.com/james-stone/");

		// finding an element by linkText and clicking on it
		driver.findElement(By.linkText("Contact Us")).click();

		// finding an element by xpath and sending value in it.
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Test");

		//// finding an element by xpath and sending value in it.
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");

		// finding an element by name and sending value in it.
		driver.findElement(By.name("telephone")).sendKeys("123456");

		// finding an element by name and sending value in it.
		driver.findElement(By.name("comments")).sendKeys("This is testing");

		// finding an element by xpath and clicking on it
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
