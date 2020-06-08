package gurr99;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args)
	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);      
                Actions builder = new Actions(driver);
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                link_Home.click();
                 
                
                builder.moveToElement(link_Home).perform();

	}

}
