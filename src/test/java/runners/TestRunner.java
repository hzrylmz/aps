package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "utilities.formatter.PrettyReports:target/cucumber-pretty-reports"},
        monochrome = true,
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        dryRun = false
)
public class TestRunner {
}
