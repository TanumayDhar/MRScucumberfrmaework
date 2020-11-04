package com.cucumberframework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberframework.helper.constants;
import com.cucumberframework.helper.waitHelper;

public class InpatientWardPageObjects {
	
	public WebDriver driver;
	waitHelper waitHelp=new waitHelper(driver);
	
	@FindBy(xpath="//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")
	WebElement appointmentScheduling;
	
	
	@FindBy(xpath="//*[@id=\"appointmentschedulingui-manageAppointmentTypes-app\"]")
	WebElement ManageServiceTypes;
	
	
	@FindBy(xpath="//button[@class='confirm appointment-type-label right']")
	//@FindBy(xpath="//button[@class='confirm appointment-type-label rightt']") //invalid ,for fail scenario
	WebElement newServiceType;
	
	
	@FindBy(id="name-field")
	WebElement nameField;
	
	@FindBy(id="duration-field")
	WebElement durationField;
	
	@FindBy(id="description-field")
	WebElement descField;
	
	@FindBy(id="save-button")
	//@FindBy(id="save-button1")  //invalid path for fail scenario test
	WebElement saveButton;
	
	public InpatientWardPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public void ClickappointmentScheduling()
	{
		//waitHelp.waitForElement(appointmentScheduling, constants.getExplicitwait());
		appointmentScheduling.click();
		
	}
	public void ClickManageServiceTypes()
	{
		//waitHelp.waitForElement(appointmentScheduling, constants.getExplicitwait());
		ManageServiceTypes.click();
		
	}
	public void EnternameField(String name)
	{
		nameField.clear();
		nameField.sendKeys(name);
		
	}
	public void EnterdurationField(String duration)
	{
		durationField.sendKeys(duration);
		
	}
	public void ClicksaveButton()
	{
		saveButton.click();
		
	}
	public void clickNewService()
	{
		newServiceType.click();
		
	}
	public void EnterdescField(String describtion)
	{
		
		descField.sendKeys(describtion);
	}
}
