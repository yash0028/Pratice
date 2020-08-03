package gurr99;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHan {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@style='font-size:16px;']")).click();
		
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		
		String Mainwin = it.next();
		System.out.println(Mainwin);
		 
		String Childwin = it.next();
		System.out.println(Childwin);
		
		if (Mainwin!=Childwin)
		{
			driver.switchTo().window(Childwin);
			driver.findElement(By.xpath("//*[@maxlength='50']")).sendKeys("Yash@gmail.com");
			driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
			Thread.sleep(1000);
			driver.close();
			
		}
		driver.switchTo().window(Mainwin);
		String MainwinTitle= driver.getTitle();
		System.out.println("On Main Window :" +MainwinTitle);
		driver.quit();
		
		
	}

}
