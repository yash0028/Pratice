package gurr99;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("flipkart");
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbtc']"));

		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("flipkart laptop")) {
				list.get(i).click();
				break;
			}
		}
		
		String title = driver.getTitle();
		String Expected = "flipkart laptop - Google Search";
		Assert.assertEquals(title, Expected);
		
		driver.quit();
		
	}

}
