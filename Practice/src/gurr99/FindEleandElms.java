package gurr99;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEleandElms {

	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();
	}

}
*/
	
/*	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
	   List<WebElement> elements	= driver.findElements(By.name("name"));
	   System.out.println("Total WebElements :"+elements.size());
	   
	   for(int i=0;i<elements.size();i++){
		   System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));

		   
	   
	   }
	
	  */ 
		public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	   List<WebElement> elements	= driver.findElements(By.tagName("a"));
	   System.out.println("Total WebElements :"+elements.size());
	   
	   for(int i=0;i<elements.size();i++){
		   System.out.println("Attribute of Href:" + elements.get(i).getAttribute("href"));
		   System.out.println("Simple Text:" + elements.get(i).getText());


		   
	   
	   }
	   driver.quit();
		
	
	}}



/*
 * Find Element Returns the first most web element if there are multiple web
 * elements found with the same locator Throws exception NoSuchElementException
 * if there are no elements matching the locator strategy It will only find one
 * web element Not Applicable
 * 
 * Find Elements 1. Returns a list of web elements 2. Returns an empty list if
 * there are no web elements matching the locator strategy 3. It will find a
 * collection of elements whose match the locator strategy. 4. Each Web element
 * is indexed with a number starting from 0 just like an array
 */