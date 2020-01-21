package automation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
    plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results\\automationTest_OctaneGherkinResults.xml")

public class automationTest {

}
