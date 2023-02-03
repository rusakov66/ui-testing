package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BombaPage;
import pages.MaximumPage;
import pages.WebPages;

import static driver_manager.DriverManager.getDriver;

public class StepsDefinition {
    private WebPages currentPage;
    private WebDriver driver;

    @Given("^I open site '(.*)' with '(.*)' browser$")
    public void search(String siteName, String browserName) {
        System.out.println("3");
        if (Serenity.sessionVariableCalled("savedBrowserName") != null) {
//            DriverManager.closeSite();
            driver = Serenity.sessionVariableCalled("savedWebDriver");
            getDriver(browserName).get(siteName);
            System.out.println(" ++ SavedWebDriver was started");
        } else {
            driver = getDriver(browserName);
            getDriver(browserName).get(siteName);
            System.out.println(" ++ SavedWebDriver was started");
        }
        getDriver(browserName).manage().window().setSize(new Dimension(1920, 1080));
        switch (siteName) {
            case "https://bomba.md":
                currentPage = PageFactory.initElements(getDriver(browserName), BombaPage.class);
                System.out.println(" -- Started " + siteName + " на " + browserName);
                break;
            case "https://maximum.md":
                currentPage = PageFactory.initElements(getDriver(browserName), MaximumPage.class);
                System.out.println(" -- Started " + siteName + " на " + browserName);
                break;
            default:
                break;
        }
        Serenity.setSessionVariable("savedWebDriver").to(driver);
        Serenity.setSessionVariable("savedBrowserName").to(browserName);
    }

    @When("^I type in the search box word '(.*)'$")
    public void navigateToSite(String forSearchString) {
        Serenity.setSessionVariable("searchingKey").to(forSearchString);
        currentPage.searching(forSearchString);
    }

    @Then("^I am on the searching page$")
    public void isSearchPage() {
        String searchingWord = Serenity.sessionVariableCalled("searchingKey");
        Assertions.assertThat(currentPage.isOnSearchingPage(searchingWord)).isEqualTo(true);
    }

    @Then("^elements are shown$")
    public void elementIsDisplayed() throws InterruptedException {
        String searchingWord = Serenity.sessionVariableCalled("searchingKey");
        Assertions.assertThat(currentPage.isElementIsDisplayed()).isEqualTo(true);
    }

}
