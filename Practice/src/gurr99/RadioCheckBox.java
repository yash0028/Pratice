package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        System.out.println("Radio 1 Clicked ");
        radio2.click();
        System.out.println("Radio 2 Clicked ");
        
        WebElement check1 = driver.findElement(By.id("vfb-6-0"));
        check1.click();
        
        if (radio1.isSelected()) {					
            System.out.println("Radiobox1 is Toggled On");					

        } else {			
            System.out.println("Radiobox1 is Toggled Off");					
        }		


        
		
		
		
	}

}
