package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		String Base = "http://demo.guru99.com/v1/";
		driver.get(Base);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement username = driver.findElement(By.xpath("//input[@type='text' and @name='uid']"));
		username.sendKeys("yash");
		Thread.sleep(700);;
		username.clear();
		WebElement usernameor = driver.findElement(By.xpath("//*[@onkeyup='validateuserid();']"));
		usernameor.sendKeys("yashor");
		
		/*WebElement passwrd = driver.findElement(By.xpath("//*[contains(@name,'password')]"));
		passwrd.sendKeys("password");*/
		
		WebElement passwrd = driver.findElement(By.xpath("//*[contains(@onblur,'validatepassword();')]"));
		passwrd.sendKeys("password1");
		
		//Xpath=//input[@type='submit' and @name='btnLogin']
		//Xpath=//*[@type='submit' or @name='btnReset']
		
		/*Xpath=//*[contains(text(),'here')]  --> used for links
		or //a[@text()='here']
		Xpath=//*[contains(@href,'guru99.com')]		
		*/
		WebElement login = driver.findElement(By.xpath("//*[@name='btnLogin' or @value='LOGIN']"));
		login.click();
		
		
		
		
		
		
		
		
		
		
	}

}
