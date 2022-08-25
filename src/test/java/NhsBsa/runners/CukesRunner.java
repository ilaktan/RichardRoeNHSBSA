package NhsBsa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"

        },

        features = "src/test/resources/features",
        glue = "NhsBsa/step_definitions",
        dryRun =false,
        tags = "@wip"
)
public class CukesRunner {
}
//@smoke
//@regression
//@wip
//@test

