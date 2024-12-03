package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = {"src/test/resources/feature/api", "src/test/resources/feature/ui"},
        glue = "com/cydeo/step_definitions",
        dryRun = true,
        tags = "@login",
        publish = true

)


public class CukesRunner {
}
