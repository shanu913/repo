import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUp {
	WebDriver driver;
	public static String FirstName, LastName, EmailAddress;
	public static Boolean click;
	public static int iteration;

	public void invokebroswer() {
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://iskdemo.com/teamwear/index.php/");
		
	}

	public void register() throws InterruptedException {
		for (int i = 1; i <= 2; i++) {
			invokebroswer();
			if (i == 1) {
				FirstName = "use";
				LastName = "us";
				click = true;
				EmailAddress = "aa4@gmail.com";
				iteration = 1;
				Thread.sleep(5000);

			} else if (i == 2) {
				FirstName = "aad";
				LastName = "use";
				click = false;
				EmailAddress = "sfsfsf";
				iteration = 2;
			}

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

	public void login() throws InterruptedException {
		invokebroswer();
		driver.findElement(By.xpath("//a[@class='login' and text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aa4@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("My Account")) {
			System.out.println("Login successfully");
		} else {
			System.out.println("Test cases failed");
		}
		//driver.navigate().to("http://iskdemo.com/teamwear/");
		driver.findElement(By.linkText("Products")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='product-image' and @title='navy']")).click();
		
		WebElement c = driver.findElement(By.id("select_212"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value='2538';",c);
		
		WebElement c1 = driver.findElement(By.id("select_211"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value='2534';",c1);
		
		
		//Select color=new Select (driver.findElement(By.id("select_212")));
		//color.selectByVisibleText("Black");
		//Select size=new Select (driver.findElement(By.id("select_211")));	
		//size.selectByVisibleText("SMALL MENS");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//button[@class='button btn-cart' and @title='Add to Cart']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//ul[@class='checkout-types top']")).click();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		SignUp obj = new SignUp();
		//obj.register();
		obj.login();

	}
}