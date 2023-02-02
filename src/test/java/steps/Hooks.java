package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @After
    public void teardown() {
//        System.out.println(" ------------- Сейчас закрывается: " + Serenity.sessionVariableCalled("savedBrowserName"));
//        DriverManager.closeSite();

//        driver = Serenity.sessionVariableCalled("savedWebDriver");
//        Serenity.setSessionVariable("savedBrowserName").to(null);
//        driver = null;
    }

    @Before
    public void beforeScenario() throws Exception {

//    System.out.println(" ------------- Сейчас закрывается: " + Serenity.sessionVariableCalled("savedBrowserName") );
//        DriverManager.closeSite();
    }

}
