package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features = {"src\\test\\resources\\Login.feature"},glue = {"stepDefinition"},tags= "@Login",plugin = {"pretty","html:reports/report.html","junit:reports/report.junit",
		                                 "json:reports/report.json"})


public class RunnerTest {

}
