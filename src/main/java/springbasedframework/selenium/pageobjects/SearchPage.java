package springbasedframework.selenium.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import springbasedframework.reporting.Reporter;

public class SearchPage extends BasePage {

    @FindBy(how = How.ID, id = "search_form_input_homepage")
    private WebElement searchBar;

    @FindBy(how = How.ID, id = "search_button_homepage")
    private WebElement searchBtn;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.duckduckgo.com/");
    }

    @Step("Searching for [{searchTerm}]")
    public void search(String searchTerm) {
        setText(searchBar, searchTerm);
        searchBar.sendKeys(Keys.TAB);
        searchBtn.click();
        Reporter.addScreenShot(driver, "Search results");

    }
}
