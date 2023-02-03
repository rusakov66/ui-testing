package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static WebDriver driver;

    private static void setDriver(String browserName) {
        switch (browserName) {
            case ("Chrome"):
                driver = new ChromeDriver(WebDriverConfig.configChrome());
                break;
            case ("Firefox"):
                driver = new FirefoxDriver(WebDriverConfig.configFirefox());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browserName);
        }
    }

    public static WebDriver getDriver(String browserName) {
        if (driver == null) {
            setDriver(browserName);

            System.out.println(" Веб Драйвер проинициализирован");
        }
        return driver;
    }

    public static void closeSite() {
        if (driver != null) {
            driver.quit();
            System.out.println(" Веб Драйвер закрыт");
        }

    }
}
