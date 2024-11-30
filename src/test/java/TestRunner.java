import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/features/login.feature", //path to your feature file
            glue = "StepDefinitions", //Path to your step definition classes
            tags = "@LoginMakeMyTrip", //Tags to filter which scenarios to run
            dryRun = false, //If true, it will not run the tests, just check if steps are defined
            plugin = {"json:target/cucumber.json", "html:target/html-reports/report.html"})

    public class TestRunner {

    }