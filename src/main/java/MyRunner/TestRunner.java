package main.java.MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features/Getrest.feature", 
		glue = {"main.java.stepDefinition" }, // the path of the step definition files																									// of																													// reporting
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false, // to check the mapping is proper between feature file and step def file	
		plugin = { "pretty", "html:target/cucumber-reports"}
		)
public class TestRunner {

}
