package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Simple_google/src/test/resources/Features/LoginPage.feature",
		glue="stepdefinition",
		//tags="sanity2"
		//dryRun=true,
		plugin= {"pretty", "html:target/cucumber-report/reports1.html"} 
		
		
		
		
		
		
		
		)
public class TestRunner {

}
