package gurr99;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		
		TakesScreenshot scr = ((TakesScreenshot)driver);
		
	
		File sr1 =scr.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(sr1,new File("C://Users//gkuma222//Desktop//Project//Practice//Practice//src//ScreenShot"));
		

		
	}

}
