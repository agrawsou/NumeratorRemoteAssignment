package com.qa.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\USER\\Project\\DemoTest\\Feature\\login.feature",glue = {"com.qa.steps"},plugin = {"pretty","html:test-output","json:test-json/Cucumber.json","junit:test-xml/Cucumber.xml"},dryRun=false,strict=true,monochrome=true)

public class TestRunner {

}
