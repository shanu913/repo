import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Account extends SignUp {
	
	
@Test
	public void AC() throws InterruptedException {
		invokebroswer();
		//driver.get(URL);
		driver.findElement(By.xpath("//img[@src='http://iskdemo.com/teamwear/skin/frontend/teamwear/default/images/my-account.png']")).click();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aa4@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/")) {
			System.out.println("Test case passed");
		} else {

			System.out.println("Test case failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://iskdemo.com/teamwear/index.php/customer/account/edit/' and text()='Edit']")).click();
}
}