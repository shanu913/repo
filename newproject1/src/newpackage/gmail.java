package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail {
	String actualTitle, expectedTitle;

	@Test
	public void main()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Shanu_Backup\\Gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		expectedTitle = "Sign in - Google Accounts";
		actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle );
		try
		{
		WebElement a1 = driver.findElement(By.xpath("//*[@id='identifierId']"));
		System.out.println("Email exits");
		a1.sendKeys("plugintest0131@gmail.com");
		a1.clear();
		}
		catch(Throwable e)
		{
			System.out.println("Emaild not found: " + e.getMessage());
		}
		WebElement a1 = driver.findElement(By.xpath("//*[@id='identifierId']"));
		a1.sendKeys("plugintest0131@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	}
}
