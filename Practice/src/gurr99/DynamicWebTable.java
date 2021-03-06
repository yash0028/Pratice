package gurr99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("http://techcanvass.com/Examples/webtable.html");
		//Step 1: First get the entire html table and store this in a variable �webtable� of type web element.


		WebElement webtable=driver.findElement(By.xpath("html/body"));
		//Get all the rows with tag name �tr� and store all the elements in a list of web elements.
		//Now all the elements with tag �tr� are stored in �rows� list.
		
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));

		System.out.println("Number of Rows including headings:"+ rows.size());
		
		

		//Finding and printing number of columns
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));

		System.out.println("Number of columns:"+ columns.size());

		//Finding & Printing the column headings

		for(int rnum=1;rnum<=rows.size();rnum++)
		{
			for (int colnum=1;colnum<=columns.size();colnum++)
			{
				if (rnum==1)
				{
					System.out.println(driver.findElement(By.xpath(	"//*[@id='t01']/tbody/tr[" + rnum + "]/th[" + colnum + "]")).getText());
				}
				else
				{
					System.out.println(driver.findElement(By.xpath(	"//*[@id='t01']/tbody/tr[" + rnum + "]/td[" + colnum + "]")).getText());
				}
			}
		}
		
		    driver.quit();
		    Thread.sleep(6000);
		    if (driver != null)
		         driver.quit();
	
		
	}

}
