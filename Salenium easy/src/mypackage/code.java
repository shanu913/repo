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
}