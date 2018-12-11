package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG {
 
	@Test
	
	public void main() throws InterruptedException{
	
	System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://teamachievekids.com/teamachieve_dev/sign_up");
	
	driver.findElement(By.id("LoginEmail") ).sendKeys("shanu.kumar@iskpro.com");
	
	driver.findElement(By.id("LoginPassword")).sendKeys("456789");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("//*[@id='ChildSelectProfileForm']/div[2]/a")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='UserUserpin']") ).sendKeys("1234");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='UserManageAccountLoginForm']/button")).click();
	
	//driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/a[2]")).click();
	
	Thread.sleep(7000);
	
	//driver.quit();
}
}