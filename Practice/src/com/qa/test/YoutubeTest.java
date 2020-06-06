package com.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.base.TestBase;
import com.qa.pages.Youtubepage;

public class YoutubeTest extends TestBase {
	

	public YoutubeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		String str = "Naveen Automation";

		Youtubepage go = new Youtubepage();
		go.stream(str);
		go.click();
	
	
	}
	
}
