package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BombaPage extends PageObject implements WebPages {

    @FindBy(className = "title-3")
    public WebElement searchResults;

    @FindBy(className = "search_word")
    public WebElement searchWord;

    public void searching(String forSearch) {
        searchWord.sendKeys(forSearch + "\n");
    }

    @Override
    public boolean isOnSearchingPage(String forSearch) {
        WebDriver driver = Serenity.sessionVariableCalled("savedWebDriver");
//        String searchingWord = Serenity.sessionVariableCalled("searchingKey");
        if (driver.getTitle().contains("Magazin online de electrocasnice - BOMBA: televizoare, frigidere")) {
            return true;
        }
        return false;

    }

}
