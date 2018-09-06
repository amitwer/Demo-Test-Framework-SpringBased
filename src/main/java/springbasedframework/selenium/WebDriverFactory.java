
package springbasedframework.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import springbasedframework.reporting.Reporter;

import javax.annotation.PostConstruct;

@Service
public class WebDriverFactory {

    @Value("${browser-type}")
    private Browser browser;

    @PostConstruct
    private void initBrowser() {
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                break;
        }
    }

    public WebDriver getBrowser() {
        WebDriver driver;
        switch (browser) {
            case CHROME:
                driver = getChromeDriver();
                break;
            case FIREFOX:
                driver = getFirefoxDriver();
                break;
            default:
                throw new InvalidArgumentException("<" + browser.name() + "> is not supported");
        }
        driver.manage().window().maximize();
        return driver;
    }

    /*
     * this function is rather trivial, it is here in case we want some special init for chrome
     **/
    private WebDriver getChromeDriver() {
        Reporter.log("Creating Chrome driver");
        return new ChromeDriver();
    }

    private WebDriver getFirefoxDriver() {
        Reporter.log("Creating Firefox driver");
       return new FirefoxDriver();
    }
}
