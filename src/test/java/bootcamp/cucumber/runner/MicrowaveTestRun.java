package bootcamp.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src/test/java/bootcamp/features/Microwave.feature",
		  glue = "bootcamp.cucumber.steps",
		  dryRun = false,
		  plugin = {"pretty",
				    "rerun:target/failedscenario.txt"				  
		           }
		)
public class MicrowaveTestRun extends AbstractTestNGCucumberTests {

}
