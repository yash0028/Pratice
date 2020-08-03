package gurr99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		String Baseurl ="http://demo.guru99.com/test/delete_customer.php";
		driver.get(Baseurl);
		driver.findElement(By.name("cusid")).sendKeys("Yash");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		String text= al.getText();
		System.out.println(text);
		Thread.sleep(1000);

		al.accept();
		al.accept();
		
		
		
		
	}

}
