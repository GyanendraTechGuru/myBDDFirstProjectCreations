package runnerMoneyControl;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//cucumber.api.junit
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/myBDDFirstProjectCreations/src/test/resources/Features/Finanace.feature",
		glue="stepDefinitions",
		monochrome=true,
		tags= {"@sanity"},
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}
