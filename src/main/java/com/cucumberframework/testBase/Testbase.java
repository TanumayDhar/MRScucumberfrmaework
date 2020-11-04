package com.cucumberframework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberframework.enums.enums;

public class Testbase {

	public static WebDriver driver;
	
	public WebDriver Setup(String browsers)
	{
		
		
		if(browsers.equals(enums.CHROME.name()))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanumay123\\Desktop\\PRACTICE_ALL\\MRScucumberFramework\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
				
		}else if(browsers.equals(enums.FIREFOX.name()))
		{
			//geckodriver
		}
		
		return driver;
	}
}
