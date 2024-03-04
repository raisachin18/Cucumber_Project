import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", // Specify the path to your feature files
        glue = "stepDef", // Specify the package where your step definitions are located
        plugin = {
                "json:target/cucumber.json"
        }
        // Specify the desired plugins (e.g., pretty, html, json, etc.)
)
public class TestRunner extends AbstractTestNGCucumberTests {
}