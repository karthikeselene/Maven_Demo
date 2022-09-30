package bootcamp.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "@target/failedscenario.txt",
		  glue = "bootcamp.cucumber.steps",
		  dryRun = false,
		  plugin = {"pretty",
				    "rerun:target/failedscenario.txt"				  
		           }
		)
public class RetryTestRun extends AbstractTestNGCucumberTests {

}