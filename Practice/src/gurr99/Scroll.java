package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		 // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	     WebElement Element = driver.findElement(By.xpath("//*[contains(@href,'http://www.guru99.com/vbscript-tutorials-for-beginners.html')]"));

	      // This will scroll the page Horizontally till the element is found		
	       js.executeScript("arguments[0].scrollIntoView();", Element);

		
		
		
	}

}
*/  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

    //Launch the application		
    driver.get("http://demo.guru99.com/test/guru99home/");
    driver.manage().window().maximize();

    //Find element by link text and store in variable "Element"        		
   // WebElement Element = driver.findElement(By.linkText("Linux"));
    WebElement Element = driver.findElement(By.linkText("Books to Read"));
    

    //This will scroll the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Element);
    
    
	}}