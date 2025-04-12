package testrunnerdemo;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\Admin\\eclipse-workspace\\Cucumberdemo\\LoginDemo\\logindemo.feature"},
		glue= {"stepdenifiondemo"}
		)
public class Runnerdemo extends AbstractTestNGCucumberTests {
	
	

}
