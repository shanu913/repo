package newpackage;

import org.testng.annotations.Test;

public class Automate {
	
	@Test
	public void main()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("2+2");
		driver.findElement(By.name("btnK")).click();
	
		
	}
}