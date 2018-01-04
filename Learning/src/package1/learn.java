package package1;

//public class learn {

	//package package1;

	//public class learn {

		//package mypackage;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		//public class code {

		}


		WebElement element = driver.findElement(By.id("formdesigner"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);



		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button' and @title='Register']")));
		driver.findElement(By.xpath("//button[@class='button' and @title='Register']")).click();




		if (element.isEnabled() && element.isDisplayed()) {
			System.out.println("Clicking on element with using java script click");

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} else {
			System.out.println("Unable to click on element");
			
			
			
			
			@Test
			public void testNestedIfExample() {

				System.out.println("Launching Firefox browser..");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.navigate().to("http://facebook.com");
				By locator = By.name("firstname");
				if (driver.findElements(locator).size() > 0) {
					if (driver.findElement(locator).isDisplayed()) {
						driver.findElement(locator).sendKeys("Hello");
					}
				}

			}
			
			
			
			
			
			public void mytrip()throws Exception{   
			    driver.get("http://yahoomail.com/");   
			    if(driver.findElement(By.xpath("username")).isDisplayed()){     
			        driver.findElement(By.xpath("username")).click();   
			        System.out.println("clicked"); 
			    } else if(driver.findElement(By.id("username")).isDisplayed()){ 
			        driver.findElement(By.id("username")).click(); 
			        System.out.println("clicked in else if");   
			    }    
			}  
			
			
			
			
			Of course it gets out of the loop. driver.findElement throws NoSuchElementException if it cannot find the element. Your xpath is not good so it will not find the element resulting in your exception.

			Boolean isPresent = driver.findElements(By.yourLocator).size()<0
			try something like that to check for elements.
			
			
			
			if(driver.findElement(By.xpath(noRecordId)).isDisplayed() )                                                                                                         
			{         
			  /**Do this*/     
			}    
			else    
			{     
			  /**Do this*/    
			}
			
			
			
			
			public void deleteSubVar() throws Exception  
			{         
			  try   
			  {    
			    if(driver.findElement(By.xpath(noRecordId)).isDisplayed() )     
			    {      
			      /**when the element is found do this*/     
			    }    
			  }      
			  catch(Exception e)     
			  {       
			   /**include the else part here*/     
			  }       
			}         
		}




		if(driver.findElements(by.xpath("//*[@id=253]")).size>0)
		{
		  //element exists with id = 253 
		  // do the stuff
		} else
		{
		   //element do not exist with id = 253. 
		   //element with id - 888 exists
		   // do the stuff
		}




		WebElement element = driver.findElement(By("element"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();



		//Find an element

		WebElement elementToClick = driver.findElement(By.xpath("Your xpath"));

		//Scroll the browser to the element's X position

		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().x+")");

		//Click the element

		elementToClick.click();



		WebElement input = driver.findElement(By.id("ADMServerPanel1_ctl02_ctl05_ctl06_btnSearch"));
		new Actions(driver).moveToElement(input).click().perform();



		driver.get("http://qtpselenium.com/");
		driver.findElement(By.xpath("//button[contains(.,'Member Login')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5); // create a WebDriverWait that we will reuse
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Login to Selenium Account')]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("Some Email ID");
		driver.findElement(By.id("login-password")).sendKeys("Some Password");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();



		 Patch2

		WebDriverWait wait = new WebDriverWait(driver, 15);          //add Explicit Wait
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("Your xpath"))));

		driver.findElement(By.xpath("Your xpath")).click();   //After Explicit Wait Click on WebElement




		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());


		Negative Scenarios:

		1) Valid User name and Invalid Password
		2) Invalid user Name and Valid Password
		3) Blank User name and Valid Password/Invalid Password
		4) Valid / Invalid User name and Blank password
		5) Blank User name and Blank password
		-----------------------------------
		Selenium Test Case:

		//public class VerifyLogin {
		static int i;
		static String username, password, iteration;
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		for (i = 1; i <= 2; i++){
		if (i == 1)    {
		username = "admin";
		password = "admin@123";
		iteration = "Iteration 1:";
		}
		else if(i == 2){
		username = "admina";
		password = "admin@123a";
		iteration = "Iteration 2:";    
		}

		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("tdb1")).click();

		String url = driver.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
		System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Admin Login 

		Successful -Passed");
		driver.findElement(By.linkText("Logoff")).click();
		Thread.sleep(2000);
		}
		else if (! url.contains("http://www.gcrit.com/build3/admin/index.php")){
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		if (ErrorMessage.contains("Invalid administrator login attempt.")){
		System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Handling Invalid 

		Inputs -Passed");
		}
		else {
		System.out.println(iteration +  "- Failed");
		}
		}
		}
		driver.close();
		}
		}




		String Message = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();

		if (Message.equals("Your Account Has Been Created!")){
		System.out.println("Customer Registration Successful - Passed");
		}
		else{
		System.out.println("Customer Registration Unsuccessful - Failed");    
		}
		driver.close();



		String url = driver.getCurrentUrl();
		//System.out.println(url);

		if (url.contains("http://www.gcrit.com/build3/index.php")){
		System.out.println("Login Successful - Passed");
		}
		else{
		System.out.println("Login Unsuccessful - Failed");
		}
		driver.close();



		//xpath using class and text
		//a[@class='headerLink' and text()='Logoff']


		// VerifyLogin 
			public static String Error_Message, username, password, iteration;

			//public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
			for (int i =1; i <=2; i++){
			if (i == 1){
			username ="admin";
			password="admin@123";
			iteration ="Iteration 1";
			}
			else if (i == 2){
			username ="admin1";
			password="admin@123";
			iteration ="Iteration 2";    
			}

			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.gcrit.com/build3/admin/");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.id("tdb1")).click();

			String URL = driver.getCurrentUrl();
			if (! URL.equals("http://www.gcrit.com/build3/admin/index.php")){
				System.out.println("Failed");  
				
			//Error_Message = driver.findElement(By.className("messageStackError")).getText();
			}

			if (URL.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println(iteration+" - Admin Login Successful -Passed");    
			}    
			else if ((! URL.equals("http://www.gcrit.com/build3/admin/index.php"))){
			System.out.println(iteration+" -Admin Login Unsuccessful and Showing Correct Error Message-Failed");
			}
			driver.close();
			}
			}
			}


		//login verify
			public static String Error_Message, username, password, iteration;

			public static void main(String[] args) {
			VerifyLogin ob =  new VerifyLogin();
				for (int i =1; i <=3; i++){
					if (i == 1){
						username ="admin";
						password="admin@123";
						ob.Run(username, password);
					} else if (i == 2) {
						username ="admin1";
						password="admin@123";
						ob.Run(username, password);
					} else if (i == 3) {
						username ="admin1";
						password="admin@123";
						ob.Run(username, password);
					}
				}
			}
			
			public void Run(String username, String password) {
				System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.gcrit.com/build3/admin/");
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.id("tdb1")).click();

				String URL = driver.getCurrentUrl();
				if (! URL.equals("http://www.gcrit.com/build3/admin/index.php")){
					System.out.println("Failed");  
					
				//Error_Message = driver.findElement(By.className("messageStackError")).getText();
				}

				if (URL.equals("http://www.gcrit.com/build3/admin/index.php")) {
				System.out.println(iteration+" - Admin Login Successful -Passed");    
				}    
				else if ((! URL.equals("http://www.gcrit.com/build3/admin/index.php"))){
				System.out.println(iteration+" -Admin Login Unsuccessful and Showing Correct Error Message-Failed");
				}
				driver.close();
			}
			}



		Teamwear

		System.setProperty("webdriver.gecko.driver","E:\\Study\\Selenium\\New folder\\geckodriver.exe");
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
	
	
	
	/*try catch
	  public void deleteSubVar() throws Exception  
{         
  try   
  {    
    if(driver.findElement(By.xpath(noRecordId)).isDisplayed() )     
    {      
      /**when the element is found do this*/     
    }    
  }      
  catch(Exception e)     
  {       
   /**include the else part here*/     
  }       
}  


/*Sign up backup
 * String url=driver.getCurrentUrl();
	if (!url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/"))
	{
	Error_Message = driver.findElement(By.linkText("click here")).getText();
	}
	if (url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/"))
	{
		System.out.println("Test cases passed");
	}
	else if (! url.equals("http://iskdemo.com/teamwear/index.php/customer/account/index/") && (Error_Message.contains("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account."))){
		System.out.println("Test cases vsfsfsf");
	}
	else
	{
		System.out.println("Test cases passed");
	}
	driver.close();
		}
	}  
