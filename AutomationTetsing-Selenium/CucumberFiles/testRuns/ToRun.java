package testRuns;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"C:\\Users\\Admin\\eclipse-workspace\\EVALUATION2\\cucumberFeatureFiles\\Login.feature"},
		glue = {"cucumberStepDefinition"}
		)

public class ToRun extends AbstractTestNGCucumberTests {
	
	

}
