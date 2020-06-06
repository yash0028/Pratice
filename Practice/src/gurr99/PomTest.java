package gurr99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		String Base = "http://demo.guru99.com/v4/";
		driver.get(Base);
		driver.manage().window().maximize();
		
		Pomjava pm = new Pomjava(driver);
		Thread.sleep(1000);
		pm.login("yash", "lol");
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		System.out.println(pm.getLoginTitle());
		System.out.println(driver.getTitle());
	}

}
