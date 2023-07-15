package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src\\main\\resources\\ features",        // click right on features and click copy path
                glue = "org.example.stepDefs",                       // click right on stepDefs and click on refactor > rename > Copy the all name
                tags = "@smokeTest",
                plugin =
                        {
                                "pretty",
                                "html:target/cucumber.html",
                                "json:target/cucumber.json",
                                "junit:target/cukes.xml",
                                "rerun:target/rerun.txt"
                        }
        )




public class Runners extends AbstractTestNGCucumberTests {


}
