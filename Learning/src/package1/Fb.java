package package1;

public class Fb {
	public static void main (String args[])
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\Selenium\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aryan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("tuser@mail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("tuser@mail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("7827693940");
		//new Select(driver.findElement(By.xpath("//*[@name='birthday_day']"))).selectByValue("12");
		Select day = new Select (driver.findElement(By.xpath("//*[@name='birthday_day']")));
		day.selectByValue("30");
		Select month = new Select (driver.findElement(By.xpath("//*[@name='birthday_month']")));
		month.selectByIndex(7);
		Select year = new Select (driver.findElement(By.xpath("//*[@name='birthday_year']")));
		year.selectByValue("1994");
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='u_0_4']")));
	    driver.findElement(By.xpath("//input[@id='u_0_4']")).click();
		//WebElement radio = driver.findElement(By.xpath("//input[@id='u_0_4']"));
		//radio.click();
		driver.findElement(By.xpath("//button[@id='u_0_y']")).click();
	}

}

}
