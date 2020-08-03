package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndParli {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/link.html";	
		driver.get(baseUrl);
		WebElement ele = driver.findElement(By.linkText("click here"));

		ele.click();
		Thread.sleep(50);
        System.out.println("Title of page is: " + driver.getTitle());							

		driver.navigate().back();
		WebElement palink = driver.findElement(By.partialLinkText("Agile Pro"));
		palink.click();
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();
		
		
		
	}

}
