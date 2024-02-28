package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(features={".//FeatureFile/policybazaar.feature"},
	glue= {"StepDefination"},plugin=/* {"pretty","html:Reports/myreports.html",
												"rerun:target/rerun.txt",
												"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}*/
	{"pretty", "html:reports/myreportss.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	,
	dryRun = false,
	monochrome = true,
	publish = true
	//tags = "@regression"
	)

public class Runner extends AbstractTestNGCucumberTests{
	
}