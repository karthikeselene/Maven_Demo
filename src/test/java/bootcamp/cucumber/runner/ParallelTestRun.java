package bootcamp.cucumber.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src/test/java/bootcamp/features/Login.feature",
		  glue = "bootcamp.cucumber.steps",
		  dryRun = false,
		  plugin = {"pretty",
				    "rerun:target/failedscenario.txt"				  
		           }
		)
public class ParallelTestRun extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {		
		return super.scenarios();
	}

}
