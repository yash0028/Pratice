package gurr99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String Url ="http://demo.guru99.com/test/guru99home/";
		
		driver.get(Url);
		// 1. By Index :
		// 2. Name and ID are attributes of iframe through which we can switch to the it.

		//--> Name--> driver.switchTo().frame("a077aa5e");
		//--> Id --> driver.switchTo().frame("a077aa5e");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*for(int i=0; i<=size; i++)
		{
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}
*/
	      
			//Commented the code for finding the index of the element
		    driver.switchTo().frame(0); //Switching to the frame
			System.out.println("********We are switched to the iframe*******");
			//driver.findElement(By.xpath("html/body/a/img")).click();
			driver.findElement(By.linkText("live-selenium-project")).click();
			//Clicking the element in line with Advertisement
		    System.out.println("*********We are done***************");
		
		

	}

}
