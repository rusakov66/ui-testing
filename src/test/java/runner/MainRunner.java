package runner;

import configuration.AppConfiguration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@aaaa")
@ContextConfiguration(classes = AppConfiguration.class)
public class MainRunner {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
}
