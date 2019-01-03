package RunTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\workspace\\Weshop\\src\\test\\java\\features\\CreateOrder.feature",
		glue = {"createOrder"},
		monochrome = true,
		plugin = {"html:target/reportbug"})
public class RunAuto {

}