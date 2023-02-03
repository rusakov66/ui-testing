package runner;

import driver_manager.DriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.annotations.events.AfterScenario;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@aaaa")

//@ContextConfiguration(classes = AppConfiguration.class)
public class MainRunner {
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

    @AfterClass
    static public void tearDown() {
        DriverManager.closeSite();
    }
    @AfterScenario
    static public void tearDown2() {
        DriverManager.closeSite();
    }
}
