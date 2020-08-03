package gurr99;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWebTable {
	/*
	 * Anything that is present on the web page is a WebElement such as text box,
	 * button, etc. WebElement represents an HTML element.
	 */
	/*
	 * Web tables are basically tabular structures in web pages arranged in a row
	 * and column format.
	 * 
	 * Web Table is an HTML element which is displayed with the help of <table> tag
	 * in conjunction with the <tr> and <td> tags. <tr> tag represents a row whereas
	 * <td> represents a column. <th> tag is used to represent the heading row.
	 * 
	 */
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();

			driver.get("http://techcanvass.com/Examples/webtable.html");
			
			
			  for(int i=1;i<=1;i++) 
			  { 
				  for(int j=1;j<=3;j++)
				  {
			  System.out.println(driver.findElement(By.xpath("//*[@id='t01']/tbody/tr["+ i  +"]/th["+ j +"]")).getText()); 
			      }
				  }
			  
			  for(int rowno=2;rowno<=4;rowno++) 
			  { 
				  for(int colno=1;colno<=3;colno++)
				  {
			  System.out.println(driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[" +rowno + "]/td[" + colno + "]")).getText()); 
			  
				  } 
				  } 
			  driver.close();
			 
			/*
			 * Map<String,String> m1 = new HashMap<String,String>();
			 * 
			 * for(int i=1;i<=4;i++) { for(int j=1;j<=3;j++) { String key =
			 * driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[1]/th["+ j
			 * +"]")).getText(); String value =
			 * driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[i+1]/td[" + j +
			 * "]")).getText(); m1.put(key,value);
			 * 
			 * } } Set<Map.Entry<String, String>> s = m1.entrySet(); for (Map.Entry<String,
			 * String> p1 :s) { String key=p1.getKey(); String b=p1.getValue();
			 * System.out.println(key+" Details:"); System.out.println(b);
			 * 
			 * }
			 */

	}

	}


