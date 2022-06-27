package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MaximumPage extends PageObject implements WebPages {

    @FindBy(className = "title-3")
    public WebElement searchResults;

    @FindBy(className = "js-search-main")
    public WebElement searchWord;

//    private WebDriver driver;

    public void searching(String forSearch) {
        searchWord.sendKeys(forSearch + "\n");
//        System.out.println("2");
    }

    @Override
    public boolean isOnSearchingPage(String forSearch) {
        WebDriver driver = Serenity.sessionVariableCalled("savedWebDriver");
        String searchingWord = Serenity.sessionVariableCalled("searchingKey");
        if (driver.getTitle().contains(searchingWord + " cumpăra la preț avantajos în Chișinău, Bălți")) {
//            System.out.println("2");
            return true;
        }
        return false;

    }

//    public boolean ifSearchingGood()
}
