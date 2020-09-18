package najah.edu;

import org.junit.runner.RunWith;
import cucumber.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases",
plugin= {"html:terget/cucumber/wikipedia.html"},
monochrome=true,
snippets =SnippetType.CAMELCASE,
glue = {"najah.edu"},
strict=true
		)

public class Acceptancetest {

}
