package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        plugin = {
                "pretty", //Konsolu renklendirir
                "html:src/test/resources/htmlReport/cucumberHooks.html"
        },

        features="src/test/resources",
        glue= {"stepDefinitions","hooks"},
        tags= "",
        dryRun= false
)


public class Runner {

}