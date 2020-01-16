package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features/",
        glue = "com/vytrack/step_definitions/",
        dryRun = false,
       // tags="@driver and @VYT-123" // {"@driver", "@VYT-123"} old syntax
        tags="@Navigate or @login"
)

public class CukesRunner {
}
