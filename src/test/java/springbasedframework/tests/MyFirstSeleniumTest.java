package springbasedframework.tests;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.BeforeClass;
import spring.ApplicationConfiguration;
import springbasedframework.businessflows.SearchFlows;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import springbasedframework.selenium.WebDriverFactory;

@SpringBootTest(classes = ApplicationConfiguration.class)
public class MyFirstSeleniumTest extends AbstractTestNGSpringContextTests {
    private WebDriver driver;
    @Autowired
    private WebDriverFactory webDriverFactory;

    @BeforeClass
    public void setup() {
        this.driver = webDriverFactory.getBrowser();
    }

    @AfterClass
    public void teardown() {
        this.driver.quit();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {

        int numOfResults = SearchFlows.search(driver, "How to use selenium?");
        Assertions.assertThat(numOfResults).as("Number of search results").isGreaterThan(0);
        Thread.sleep(4000);
    }


}
