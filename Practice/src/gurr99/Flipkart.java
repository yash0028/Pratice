package gurr99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Flipkart {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("flipkart");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='btnK']")).click();
		driver.findElement(By.xpath(".//div/table/tbody/tr[4]/td[2]/div/span/h3/a")).click();
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com");
		/*
		 * boolean image = driver.findElement(By.xpath(
		 * "//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")).
		 * isDisplayed(); Assert.assertTrue(image, "Image Displayed");
		 * System.out.println("Image Displayed");
		 */		
		driver.close();
		
		
	}

}
