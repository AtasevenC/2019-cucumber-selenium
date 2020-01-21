package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"}, // we use this cucumber reporting
        features ="src/test/resources/features/",
        glue = "com/vytrack/step_definitions/",
        dryRun = false,
        // tags="@driver and @VYT-123" // {"@driver", "@VYT-123"} old syntax
       tags= "@Login"
)

public class CukesRunner {
}