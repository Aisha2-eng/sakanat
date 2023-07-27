package acceptedTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="set_case/Login.feature",
		plugin="html:target/cucumber/out.html",
		monochrome=true,
	    snippets=SnippetType.CAMELCASE,
		glue ="acceptedTest"
		
		)

public class acceptedTest {

}
