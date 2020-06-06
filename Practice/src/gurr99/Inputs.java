package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String Baseurl = "http://demo.guru99.com/test/login.html";
		driver.get(Baseurl);
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		email.sendKeys("yash@pop.com");
		Thread.sleep(20);
		password.sendKeys("poikul");
		
		System.out.println("Text input given ");
		Thread.sleep(20);

		email.clear();
		password.clear();
		System.out.println("Text input cleared ");
		
		login.click();
		
		

		
		
	}

}
