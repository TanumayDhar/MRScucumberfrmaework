package com.cucumberframework.stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumberframework.enums.enums;
import com.cucumberframework.testBase.Testbase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Testbase base=new Testbase();

	@Before
	public void initializeTest()
	{
		base.Setup(enums.CHROME.name());

	}

	@After
	public void endtest(Scenario scenario)
	{

		if(scenario.isFailed())
		{
		
			System.out.println("the failed scenario is "+ scenario);

			scenario.embed(((TakesScreenshot) Testbase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}else
		{
			System.out.println("the passed scenario is "+ scenario);
			scenario.embed(((TakesScreenshot) Testbase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}


		Testbase.driver.quit();
	}
}
