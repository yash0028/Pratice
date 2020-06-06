package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


public class Youtubepage extends TestBase
{
	@FindBy (name="search_query")
	WebElement search;
	
	@FindBy(xpath="//*[contains(@id,'search-icon-legacy')]")
	WebElement button;
	
	
	public Youtubepage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	public void stream(String str){

		search.sendKeys(str);
		
	}

	public void click(){
		button.click();
		
	}

	

}
