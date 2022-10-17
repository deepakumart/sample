package Book;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
//import Demoqe_class.Base_class;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
public class runner{
//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\TZ167UZ\\eclipse-workspace\\Automation\\src\\test\\java\\com\\feature\\feature.feature",glue="com.step_definition",plugin= {"pretty","html:Report/HTMLReport.html"})

public static class runner_class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		//driver=Base_class.getBrowser("chrome");
	}
	@AfterClass
	public static void tear_down() {
		//driver.close();
	}
	
}
}
