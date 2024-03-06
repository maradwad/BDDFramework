package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"C:\\Users\\maaradwa\\git\\BDDFramework\\src\\test\\resources\\register.feature"},
glue="stepDefinition",
//tags= "not @tag1",
dryRun = false

		)
public class loginRunner {

}
