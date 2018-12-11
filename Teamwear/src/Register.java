import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	public static String FirstName, LastName, EmailAddress;
	public static Boolean click;
	public static int iteration;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko\\geckodriver.exe");
		for (int i = 1; i <= 2; i++) {
			if (i == 1) {
				FirstName = "use";
				LastName = "us";
				click = true;
				EmailAddress = "a112@gmail.com";
				iteration = 1;
			} else if (i == 2) {
				FirstName = "aad";
				LastName = "use";
				click = false;
				EmailAddress = "u.com";
				iteration = 2;
			}

			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://iskdemo.com/teamwear/index.php/");
			driver.findElement(By.xpath("//a[text()='Sign Up'and @class='login']")).click();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(FirstName);
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(LastName);
			driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys(EmailAddress);
			driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("1234");
			if (click) {
				WebDriverWait wait = new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//button[@type='submit'and @title='Register']")));
				driver.findElement(By.xpath("//input[@name='I sell products online']")).click();
			}
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='store_name']")).sendKeys("ABC");
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			wait1.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'and @title='Register']")));
			driver.findElement(By.xpath("//button[@type='submit'and @title='Register']")).click();
			Thread.sleep(10000);

			String title = driver.getTitle();
			System.out.println(title);

			if (title.equals("My Account")) {
				System.out.println("iteration " + iteration + " Test cases passed");
			} else {
				System.out.println("iteration " + iteration + " Test cases failed");
			}
		}
	}
}