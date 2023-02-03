package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MaximumPage extends PageObject implements WebPages {

    @FindBy(className = "title-3")
    public WebElement searchResults;

    @FindBy(className = "item-product")
//    item-product-in card_product
    public List<WebElement> searchedResults;

    @FindBy(className = "js-search-main")
    public WebElement searchWord;


    @Override
    public void searching(String forSearch) {
        searchWord.sendKeys(forSearch + "\n");
    }

    @Override
    public boolean isOnSearchingPage(String forSearch) {
        WebDriver driver = Serenity.sessionVariableCalled("savedWebDriver");
        String searchingWord = Serenity.sessionVariableCalled("searchingKey");
        if (driver.getTitle().contains("cumpăra la preț avantajos în Chișinău, Bălți")) {
            return true;
        }
        return false;
    }
    public boolean isElementIsDisplayed() {
        WebDriver driver = Serenity.sessionVariableCalled("savedWebDriver");
        List <WebElement> searchedResults = driver.findElements(By.className("product__item"));
//        List<String> elementList = new ArrayList<>();
//  class="js-content product__item  "
//        for (String elemen : elementList) {
//
//            elemen = searchedResults.getText();
//            elemen = searchedResults.


//        }
        System.out.println("2");
        return searchedResults.size() > 0;
    }

}
