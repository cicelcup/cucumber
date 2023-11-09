package com.cicelcup;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/com/cicelcup/cucumber/myFirstTest.feature"
,glue={"src/test/java/com/cicelcup"}
)

public class CucumberTest {
}
