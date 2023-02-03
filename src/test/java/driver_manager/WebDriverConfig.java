package driver_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverConfig {

    public static ChromeDriver configChrome() {
        // Указываем путь к локальному chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver119.exe");

        ChromeOptions options = new ChromeOptions();
//        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setAcceptInsecureCerts(true);
        // Добавляем дополнительные опции по необходимости

        // Возвращаем новый экземпляр ChromeDriver с нашими опциями
        return new ChromeDriver(options);
    }

    public static FirefoxDriver configFirefox() {
        // Указываем путь к локальному geckodriver.exe
        System.setProperty("webdriver.gecko.driver", "путь/к/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        // Указываем путь к бинарному файлу Firefox, если это необходимо
        // options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        // Возвращаем новый экземпляр FirefoxDriver с нашими опциями
        return new FirefoxDriver(options);
    }
}
