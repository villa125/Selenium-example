package com.villa.automationTest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/"},
        plugin   = {"pretty"},
        glue     = {"com.villa.automationTest.steps"})
public class RunCucumberIT {
}