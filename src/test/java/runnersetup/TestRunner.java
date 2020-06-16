package runnersetup;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
						features="src/main/resources/config/StoryID-ListFunctionalityTest.feature", 
						glue= "",
						tags= "@Debug",
						plugin = {"html:target/report/html/smoke", "json:target/report/smoke/json-report.json" })

public class TestRunner {

}

