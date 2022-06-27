package steps;

import driver_manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;

public class Hooks {

    @After
    public void teardown() {
        System.out.println(" ------------- Сейчас закрывается: " + Serenity.sessionVariableCalled("savedBrowserName"));
        DriverManager.closeSite();
    }

    @Before
    public void beforeScenario() throws Exception {

//    System.out.println(" ------------- Сейчас закрывается: " + Serenity.sessionVariableCalled("savedBrowserName") );
//        DriverManager.closeSite();
    }

}
