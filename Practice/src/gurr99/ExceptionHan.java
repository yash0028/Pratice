package gurr99;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionHan {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

//1.NoSuchElementException -> WebDriver is unable to find and locate elements.
		try {
			WebDriverWait wait = new WebDriverWait(driver,25);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit"))).click();
			}
			catch (WebDriverException e) 
			{
			System.out.println("An exceptional case.");
			}
			
			catch (NoSuchElementException  e) 
			{
			System.out.println(e);
			}
		
//2.NoSuchWindowException-> when WebDriver tries to switch to an invalid window.
		for (String handle : driver.getWindowHandles()) {
			try {
			driver.switchTo().window(handle);
			} 
			catch (NoSuchWindowException e)
			{
			System.out.println(e);
			}
			}
		
//3. NoSuchFrameException->When WebDriver is trying to switch to an invalid frame
		try {
			WebDriverWait wait = new WebDriverWait(driver,25);
			wait.until(ExpectedConditions.frameToBeAvaliableAndSwitchToIt(frame_11));
			try {
			driver.switchTo().frame("frame_11");
			} catch (WebDriverException e) 
			{
			System.out.println(e);
			}
			} catch (TimeOutException e) {
			System.out.println(e);
			}
		
//4.NoAlertPresentException-> WebDriver tries to switch to an alert, which is not available.
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			try {
			driver.switchTo().alert().accept();
			} catch (NoAlertPresentException e) {
			System.out.println(e);
			}
			} catch (TimeOutException e){
			System.out.println(e);
			}
		
//5.InvalidSelectorException -> selector is incorrect or syntactically invalid. 
		//This exception occurs commonly when XPATH locator is used.
		try {
			driver.findElement(By.xpath("//button[@type='button']")).click();
			} catch (InvalidSelectorException e) {
			}

//6.ElementNotVisibleException
		// If WebDriver tries to find an element in the webpage before the page completely loads, 
		//then exception ElementNotVisibleException is thrown. 
		//To avoid this exception, waits commands are added.
		//the exception is thrown even if the page has not loaded completely.
		//WebDriver tries to perform an action on an invisible web element,
		//the web element is in a hidden state.
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
			try {
			driver.findElement(By.id("submit")).click();
			} catch (WebDriverException e) {
			System.out.println(e);
			}
			} catch (TimeOutException e){
			System.out.println(e);
			}
		
//7.ElementNotSelectableException
		//web element is present in the web page but cannot be selected.
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions. elementToBeClickable(By.id("swift")));
			try {
			Select dropdown = new Select(driver.findElement(By.id("swift")));
			} catch (WebDriverException e) {
			System.out.println(e);
			}
			} catch (TimeOutException e) {
			System.out.println(e);
			}
		
//8.TimeoutException
		//if the components don’t load even after the wait, 
		//the exception org.openqa.selenium.TimeoutException will be thrown.
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		//driver.get(“https://www.softwaretestinghelp.com” );

		//In the above program, an implicit wait of 10 seconds is added. 
		//If the page www.softwaretestinghelp.com doesn’t load in 10 seconds, 
		//then TimeoutException will be thrown.
	
		//To avoid this, we can manually check the average time for a page to load and adjust the wait
		//Or, we can add explicit wait using JavaScript executor until the page is loaded.

		//JavaScript executor is used. After page navigation, 
		//we call JavaScript return document.readyState for 20 seconds until “complete” is returned.

		driver.get("https://www.softwaretestinghelp.com");

		WebDriverWait wait = new WebDriverWait(driver,30);
 
		wait.until(webDriver -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
 
//9.StaleElementReferenceException
		//Indicates that a reference to an element is now "stale" --- 
		//the element no longer appears on the DOM of the page.
		//there is an element that is found on a web page referenced as a WebElement in WebDriver.
		//If the DOM changes then the WebElement goes stale. 
		//If we try to interact with an element which is staled then the StaleElementReferenceException is thrown.
		//The two reasons for Stale Element Reference are

		//1.The element has been deleted entirely.
		//2.The element is no longer attached to the DOM.
		//We face this stale element reference exception when the element 
		//we are interacting is destroyed and then recreated again. 
		//When this happens the reference of the element in the DOM becomes stale. 
		//Hence we are not able to get the reference to the element.
		//A. You could refresh the page and try again for the same element.
		driver.navigate().refresh();
		driver.findElement(By.xpath("xpath here")).click();
		//B. If an element is not attached to DOM then 
		//you could try using ‘try-catch block’ within ‘for loop’
		// Using for loop, it tries for 3 times. 
		// If the element is located for the first time then it breaks from the for loop nad comeout of the loop
		for(int i=0; i<=2;i++){
		  try{
		     driver.findElement(By.xpath("xpath here")).click();
		     break;
		  }
		  catch(Exception e){
		     System.out.println(e.getMessage());
		  }
		  
		  //C.The crucial part is the "chaining" of Selenium's own ExpectedConditions via 
		  //the ExpectedConditions.refreshed(). 
		  //This actually waits and checks if the element in question has been refreshed 
		  //during the specified timeout and additionally waits for the element to become clickable.
		  WebDriverWait wait1 = new WebDriverWait(driver, 25);
		    wait1.until
		    (ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
		    driver.findElement(locator).click();
		}
		  
		 //D. We can handle Stale Element Reference Exception by using POM.
		// In POM, we use initElements() method which loads the element but it won’t initialize elements. 
		//initElements() takes latest address. It initializes during run time
		//when we try to perform any action on an element. 
		//This process is also known as Lazy Initialization.


		}

	

		
	
}
