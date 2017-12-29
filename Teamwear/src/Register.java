import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {
	static WebDriver driver = new FirefoxDriver();
	public static String username,password;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
		driver.get("http://www.gcrit.com/build3/admin/");
		
		
		Register ob=new Register();
		
		
		
		for (int i =1; i <=3; i++){
			if (i == 1){
				username ="admin";
				password="admin@123";
				ob.valid(username,password);
			} else if (i == 2) {
				username ="admin1";
				password="admin@123";
				ob.invalid(username,password);
			} else if (i == 3) {
				username ="admin1";
				password="admin@123";
			}
		}
	}
	public void valid(String username, String password) throws InterruptedException
	{
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='headerLink' and text()='Logoff']")).click();
		System.out.println("Test case pass sucessfully" );
		
	}
	public void invalid(String username, String password)
	{
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		//Thread.sleep(5000);
		System.out.println("Test case failed" );
	}
		}
gsdg dgdg




		
	
	