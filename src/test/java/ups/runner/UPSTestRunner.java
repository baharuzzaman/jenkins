package ups.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class UPSTestRunner {

	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
			features = {"src/test/resources/Features" }, 
			glue = { "ups.stepDef" }, tags = {"@MouseHover"}, monochrome = true)

	public class RunCucumberTest extends AbstractTestNGCucumberTests {

	}

}
