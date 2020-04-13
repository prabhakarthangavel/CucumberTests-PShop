package main.java.stepDefinition;

import cucumber.api.java.Before;

public class TestInitialize {
	
	@Before
	public void TestSetup() {
		CucumberTest test = new CucumberTest();
	}

}
