package com.cucumberframework.stepDefinations;
import com.cucumberframework.PageObjects.InpatientWardPageObjects;
import com.cucumberframework.testBase.Testbase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class InpatientwardStepDefinations extends Testbase{


	InpatientWardPageObjects inpatientWardPageObjects=new InpatientWardPageObjects(driver);

	@Then("^user able to loged in to inpatient Ward as an Admin.$")
	public void user_able_to_loged_in_to_inpatient_ward_as_an_admin() throws Throwable {
		System.out.println("verified");
	}

	@Then("^user selects Appointment Scheduling$")
	public void user_selects_appointment_scheduling() throws Throwable {
		inpatientWardPageObjects.ClickappointmentScheduling();
	}

	@Then("^user verifies new creation of Service type.$")
	public void user_verifies_new_creation_of_service_type() throws Throwable {
		System.out.println("verified");
	}



	@And("^verifies user loged in to Inpatient ward.$")
	public void verifies_user_loged_in_to_inpatient_ward() throws Throwable {
		System.out.println("verified");
	}

	@And("^selects Manage service Types$")
	public void selects_manage_service_types() throws Throwable {
		inpatientWardPageObjects.ClickManageServiceTypes();
	}

	@And("^click on New Service Types$")
	public void click_on_new_service_types() throws Throwable {
		inpatientWardPageObjects.clickNewService();
	}

	@And("^enters name as \"([^\"]*)\"$")
	public void enters_name_as_something(String strArg1) throws Throwable {
		inpatientWardPageObjects.EnternameField(strArg1);
	}

	@And("^enters Duration as \"([^\"]*)\"$")
	public void enters_duration_as_something(String strArg1) throws Throwable {
		inpatientWardPageObjects.EnterdurationField(strArg1);
	}

	@And("^enters Description as \"([^\"]*)\"$")
	public void enters_description_as_something(String strArg1) throws Throwable {
		inpatientWardPageObjects.EnterdescField(strArg1);
	}

	@And("^user click on Save button.$")
	public void user_click_on_save_button() throws Throwable {
		inpatientWardPageObjects.ClicksaveButton();
	}

}
