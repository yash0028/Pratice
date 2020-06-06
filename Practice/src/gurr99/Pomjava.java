package gurr99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pomjava {
	
	
	
	 WebDriver driver;

	    By userid = By.name("uid");

	    By password = By.name("password");

	    By titleText =By.className("barone");

	    By login = By.name("btnLogin");

	    public Pomjava(WebDriver driver)
	    {

	        this.driver = driver;


}
	    public WebElement getUserid(){
	    	return driver.findElement(userid);
	    }
	    
	    public WebElement getPass(){
	    	return driver.findElement(password);
	    	
	    }
	    
	    
	    public String getLoginTitle(){

	        return  driver.findElement(titleText).getText();
	    }
	    
	    public WebElement login(){

	         return driver.findElement(login);
	    
	    
	    
	    }
	    
	    public void login(String uid, String pwd){
	    	
	    	getUserid().sendKeys(uid);
	    	getPass().sendKeys(pwd);
	    	login().click();
	    	
	    	
	    }
}
