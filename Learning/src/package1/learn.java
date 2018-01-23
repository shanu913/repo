package package1;

//public class learn {

	//package package1;

	//public class learn {

		//package mypackage;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

Span
//span[text()='Thank you for registering with TeamWear.']	


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
	
	If else
	String title=driver.getTitle();
	System.out.println(title);
	if (title.equals("My Dashboard"))
	{
		System.out.println("Test cases passed");
	}
	else
	{
		System.out.println("Test cases failed");
	}
	driver.close();
		}
	}  
	}
	
	
	If else......
	
	if (driver.findElement(By.xpath("//span[text()='Thank you for registering with TeamWear.']")).isDisplayed()==true)
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
	}
	}


/*


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	public static String FirstName, LastName, EmailAddress, Error_Message;
	public static Boolean click;
	public static int iteration;
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "D:\\gecko\\geckodriver.exe");
	for (int i =1; i <=2; i++){
		if (i == 1){
			FirstName ="use";
			LastName="us";
			click = true;
			EmailAddress="a16@gmail.com";
			iteration=1;
		} else if (i == 2) {
			FirstName ="aad";
			LastName="use";
			click = false;
			EmailAddress="u.com";
			iteration=2;
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
	Thread.sleep(5000);
	
		String title=driver.getTitle();
		
		if (title.equals("My Account"))
		{
			System.out.println("iteration "+ iteration +" Test cases passed");
		}
		else
		{
			System.out.println("iteration "+ iteration +" Test cases failed");
		}
		driver.close();
			}
		}  
		}

Shortcut .......
Formating - ctrl+A then Ctrl+shift+f


{
		driver.get("http://iskdemo.com/teamwear/index.php/");
		driver.findElement(By.xpath("//a[@class='login' and text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a20@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		System.out.println("Login sucessfully");
		
	}

By link text ............
driver.findElement(By.linkText("Products")).click();



Select command .....
WebElement dd=driver.findElement(By.xpath("//select[@id='select_212']"));
		Select color=new Select(dd);
		WebElement selected_value=color.getFirstSelectedOption();
		System.out.println("selected value is " +selected_value.getText());
		Thread.sleep(10000);
		color.selectByValue("Black");
		WebElement selected_value1=color.getFirstSelectedOption();
		System.out.println("selected value is " +selected_value1.getText());
		
		
		Ul .......
		//ul[@class='checkout-types top']
		 
		 
		 Javascript for drop down .................
		 
		 WebElement select = driver.findElement(By.id("select_212"));

		((JavascriptExecutor)driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", select, "Navy")
		Source: https://stackoverflow.com/questions/38239278/how-to-select-a-value-from-drop-down-using-selenium
		
		or
		
		WebElement c = driver.findElement(By.id("select_212"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value='2538';",c);
		Source: http://selenium-interview-questions.blogspot.in/2014/11/unable-to-select-value-from-drop-down.html
		
		Javascript to click an element ...
		WebElement element = driver.findElement(By.id("gbqfd"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
		
		Clicking a web element .........................................
		
		// Locating the web element using id
WebElement element = driver.findElement(By.id("id of the webelement"));

// Instantiating JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor)driver;

// Clicking the web element
js.executeScript("arguments[0].click();", element);


Typing in a Text Box ......................................................

// Instantiating JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor)driver;

// Typing the test data into Textbox
js.executeScript("document.getElementById(‘id of the element’).value=’test data’;”);


Scrolling down until the web element is in the view .......................................

WebElement element=driver.findElement(By.xpath("//input[contains(@value,'Save')]"));

// Instantiating the javascriptExecutor and scrolling into the view in the single test step
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);

Source: http://www.softwaretestinghelp.com/efficient-selenium-scripting-selenium-tutorial-27/


Div + Button to click ...............
//div[@id='billing-buttons-container']/button
 * 
 * <div class="Caption">
  Model saved
</div>
Write this -

//div[contains(@class, 'Caption') and text()='Model saved']
 */

		
		
		 */

*/