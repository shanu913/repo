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