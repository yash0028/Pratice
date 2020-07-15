package gurr99;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable1 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installation\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement webtable=driver.findElement(By.xpath("html/body/table"));
		//Get all the rows with tag name ‘tr’ and store all the elements in a list of web elements.
		//Now all the elements with tag ‘tr’ are stored in ‘rows’ list.
		
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));

		System.out.println("Number of Rows including headings:"+ rows.size());
		
		

		//Finding and printing number of columns
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));

		System.out.println("Number of columns:"+ columns.size());

		//Finding & Printing the column headings

		for(int rnum=1;rnum<=rows.size();rnum++)
		{
			for (int colnum=1; colnum<=columns.size();colnum++)
			{
				if (rnum==1)
				{
					System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr[" + rnum + "]/th[" + colnum + "]")).getText());
				}
				else
				{
					System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + rnum + "]/td[" + colnum + "]")).getText());
				}
			}
		}
		
		    driver.quit();
		    Thread.sleep(6000);
		    if (driver != null)
		         driver.quit();
	
	
	
	}

}
