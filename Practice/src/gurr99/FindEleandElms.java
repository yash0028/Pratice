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
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
	   List<WebElement> elements	= driver.findElements(By.name("name"));
	   System.out.println("Total WebElements :"+elements.size());
	   
	   for(int i=0;i<elements.size();i++){
		   System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));
	   
	   }
	
	   
		
	
	}}