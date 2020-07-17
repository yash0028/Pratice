package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installation\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://www.google.com/search?q=amazon.in&oq=ama&aqs=chrome.1.69i57j35i39j0l5j46.4627j0j7&sourceid=chrome&ie=UTF-8");
	    //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
	    driver.findElement(By.xpath("//div/table/tbody/tr[5]/td[2]/div/span/h3/a")).click();
	    System.out.println("Executed Successfully ");
	
	}

}
