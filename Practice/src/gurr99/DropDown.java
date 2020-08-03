package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		String Base = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(Base);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("country"));
		Select ss = new Select(ele);
		ss.selectByValue("WEST BANK");
		ss.selectByVisibleText("ANGOLA");;
		
		
	}

}
