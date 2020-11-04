package com.cucumberframework.runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\tanumay123\\Desktop\\PRACTICE_ALL\\MRScucumberFramework\\src\\main\\java\\com\\cucumberframework\\features\\InpatientwardParameterisedDataTable.feature",
glue="com.cucumberframework.stepDefinations", monochrome=true,plugin= {"pretty","html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/cucumberTestReport.json",
"rerun:target/cucumber-reports/cucumberTestReport.txt"})
public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}
	

}
