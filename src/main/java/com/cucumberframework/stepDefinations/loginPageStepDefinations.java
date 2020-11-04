package com.cucumberframework.stepDefinations;

import java.util.List;

import com.cucumberframework.PageObjects.LoginPagePageObjects;
import com.cucumberframework.helper.constants;
import com.cucumberframework.helper.waitHelper;
import com.cucumberframework.testBase.Testbase;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginPageStepDefinations extends Testbase{

	LoginPagePageObjects loginpage=new LoginPagePageObjects(driver);
	waitHelper waithelp;


	@Given("^User navigate to \"([^\"]*)\".$")
	public void user_navigate_to_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		waithelp=new waitHelper(driver);

		waithelp.waitForElement(loginpage.userName, constants.getExplicitwait());
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\".$")
	public void user_enters_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {

		//waithelp.waitForElement(loginpage.passWord, constants.getExplicitwait());
		loginpage.enterUser(strArg1);
		loginpage.enterPassword(strArg2);
	}
	@And("^click on Inpatient Ward.$")
	public void click_on_inpatient_ward() throws Throwable {
		loginpage.clickInpatientWard();
	}

	@And("^click on Log In button.$")
	public void click_on_log_in_button() throws Throwable {
		loginpage.clickLogin();
	}
	
	
	@When("^User enters username and password as$")
    public void user_enters_username_and_password_as(DataTable data) throws Throwable {
		
		
			List<List<String>>listData=data.raw();
			System.out.println(listData);
			
			loginpage.enterUser(listData.get(0).get(0));
			loginpage.enterPassword(listData.get(0).get(1));
			
		
       
    }

	
	
	
	
	
	
	
	
}
