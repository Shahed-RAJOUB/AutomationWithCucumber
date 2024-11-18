package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// u can use (and) and u can use (or) , (not) for tags , pretty will make it colorfull
//Valid values for PLUGIN are: html, json, junit, message, pretty, progress, rerun, summary, teamcity, testng, timeline, unused, usage
// dryrun will tell by compilling that something is missing before executing tests
@CucumberOptions(features = "src/test/java/features",
        dryRun = true , glue = "stepDefinitions" , monochrome = true , tags = " @SmokeTest or @Regression",
plugin = {"pretty", "html:target/cucmber.html" , "json:target/cucmber.json"})
public class TestRunnerCu extends AbstractTestNGCucumberTests {
}
