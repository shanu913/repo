package mypackage;


public class code {

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




WebDriverWait wait = new WebDriverWait(driver, 15);          //add Explicit Wait
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("Your xpath"))));

driver.findElement(By.xpath("Your xpath")).click();   //After Explicit Wait Click on WebElement




// Check the title of the page
System.out.println("Page title is: " + driver.getTitle());

hi world
