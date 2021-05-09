package springbasedframework.selenium.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage extends BasePage {

    @FindBy(how = How.ID, id = "links")
    private WebElement searchResult;

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get number of results")
    public int getNumOfResults() {
        var firstPageResults = searchResult.findElements(By.xpath("div"));
        return firstPageResults.size();
    }
}


