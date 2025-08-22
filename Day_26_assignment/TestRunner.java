package ebay_tests;

import org.junit. runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/ebay_features",
				  glue = "ebay_tests",
				  plugin = {"pretty", "html: target/HTML/htmlreport1.html",
						    "json:target/JSON/jsonreport1",
                    	    "junit:target/JUNIT/junitreport1"})

public class TestRunner {
	
}