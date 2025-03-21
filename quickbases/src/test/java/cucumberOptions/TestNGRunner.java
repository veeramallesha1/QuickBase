package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
							glue="stepDefinitions", 
							tags = "@SmokeTest or @Sanity", 
							monochrome =true,
							plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/failed_scenarios.txt"})
public class TestNGRunner  extends AbstractTestNGCucumberTests{

}
