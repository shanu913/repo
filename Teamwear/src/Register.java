import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register {
	
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://iskdemo.com/teamwear/index.php/");
		driver.findElement(By.xpath("//a[text()='Sign Up'and @class='login']")).click();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'and @title='Register']")));
		driver.findElement(By.xpath("//button[@type='submit'and @title='Register']")).click();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("User");
		driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("t.user.com");
	}
	
	

}

	


