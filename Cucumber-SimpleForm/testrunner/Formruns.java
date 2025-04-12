package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"C:\\Users\\Admin\\eclipse-workspace\\cucumber\\Form-FeatureFiles\\Form.feature"},
		glue = {"stepdefinitionfiles"}
		)

public class Formruns extends AbstractTestNGCucumberTests {
	
	
	

}
