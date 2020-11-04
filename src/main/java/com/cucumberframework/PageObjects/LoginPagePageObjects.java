package com.cucumberframework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberframework.helper.constants;
import com.cucumberframework.helper.waitHelper;

public class LoginPagePageObjects {
	
	
	private WebDriver driver;
	waitHelper waithelp=new waitHelper(driver);
	
	
	
	@FindBy(xpath="//*[@id=\"username\"]")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public WebElement passWord;
	
	@FindBy(xpath="//*[@id=\"Inpatient Ward\"]")
	WebElement clickInpatientWard;
	
	
	@FindBy(xpath="//*[@id=\"loginButton\"]")
	WebElement clickLoginButton;
	
	public LoginPagePageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//waithelp.waitForElement(userName, constants.getExplicitwait());
		
	}
	
	
	
	public void enterUser(String uName)
	{
		
		userName.sendKeys(uName);
		
	}
	
	public void enterPassword(String pWord)
	{
		passWord.sendKeys(pWord);
		
	}
	
	public void clickInpatientWard()
	{
		clickInpatientWard.click();
		
		
	}
	
	public void clickLogin()
	{
		clickLoginButton.click();
		
	}

}
