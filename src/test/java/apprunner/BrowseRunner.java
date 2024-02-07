package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src\\test\\resources\\featurefile\\launch_browser.feature"},
		glue = {"steps"}
)

public class BrowseRunner extends AbstractTestNGCucumberTests {

}
