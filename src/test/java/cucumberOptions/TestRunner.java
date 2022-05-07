package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".//Features/gmail.feature", // for all tests which are there in feature
		glue = "stepDefinations", 
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/cucumber-report.json" })
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
