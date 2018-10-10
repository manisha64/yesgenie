package cucumberTest;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/*@RunWith(Cucumber.class)*/
@CucumberOptions(
        features = "C:\\Users\\mchauhan\\IdeaProjects\\YesBankGenie\\src\\test\\java\\Features\\Login.feature"
        ,glue={"Steps"}
        /*,tags = {"@chrome"}*/
)
public class TestRunner extends AbstractTestNGCucumberTests {
}



