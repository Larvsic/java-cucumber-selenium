package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"features"},
			glue = {"steps"},
			plugin = {"pretty", "html:Report"},
			dryRun = false, // if dryRun is TRUE only will tell you which steps are missing to implement. FALSE is the default 
			monochrome = true
			//tags = ("@SmokeTests"), // this tag option can determine which scenarios will run
			//name = {"Advanced"} // this name option works by identifying all the match with that word on the scenario name existing.
		)
public class TestRunner {

}
