package kata.fizzbuzz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    format = "pretty",
	    features = "src/test/resources/"  //refer to Feature file
)
public class RunCukesTest {

}
