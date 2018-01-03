import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	public static String FirstName, LastName, EmailAddress, Error_Message;
	public static Boolean click;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
	for (int i =1; i <=2; i++){
		if (i == 1){
			FirstName ="use";
			LastName="us";
			click = true;
			EmailAddress="us@gmail.com";
		} else if (i == 2) {
			FirstName ="aadmin7";
			LastName="user8";
			click = false;
			EmailAddress="user9.com";
		}
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://iskdemo.com/teamwear/index.php/");
	driver.findElement(By.xpath("//a[text()='Sign Up'and @class='login']")).click();
	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(FirstName);
	driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(LastName);
	driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys(EmailAddress);
	driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("1234");
	if(click) {
	WebDriverWait wait = new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'and @title='Register']")));
	driver.findElement(By.xpath("//input[@name='I sell products online']")).click();
	}
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='store_name']")).sendKeys("ABC");
	WebDriverWait wait1 = new WebDriverWait(driver, 40);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'and @title='Register']")));
	driver.findElement(By.xpath("//button[@type='submit'and @title='Register']")).click();
	
	String url=driver.getCurrentUrl();
	if (!url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/"))
	{
		System.out.println("Test cases failed");
	}
	if (url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/"))
	{
		System.out.println("Test cases passed");
	}
	else if (! url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/")) && (Error_Message.contains("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.")){
	driver.close();
		}
	}  
	}

