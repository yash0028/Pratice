package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.Testutil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/gkuma222/Documents/ppp/Practice/src/com/qa/prop/config.properties");
		prop.load(fis);

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkuma222\\Documents\\ppp\\Practice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
		}
}}