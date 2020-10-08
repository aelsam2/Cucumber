package stepDefenition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefenition"},
monochrome=true,
plugin= {"pretty","html:target/htmlReport","json:target/cucumber.json"}
)
public class TestRunner {

}
