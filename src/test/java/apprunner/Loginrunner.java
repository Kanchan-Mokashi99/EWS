package apprunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\featurefile\\login.feature"},
		
	glue = {"loginSteps"},
		
		publish = true  //to generate online report
	
		)	
public class Loginrunner extends AbstractTestNGCucumberTests {

}
