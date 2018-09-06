package springbasedframework.selenium.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import springbasedframework.reporting.Reporter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultsPage extends BasePage{

    @FindBy(how = How.ID, id = "resultStats")
    private
    WebElement searchResult;

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get number of results")
    public int getNumOfResults() {
        String resultStatsText = searchResult.getText();
        String hebrewPattern = "כ-([\\d,]*) תוצאות";
        String englishPattern = "About ([\\d,]*) results";
        Matcher matcher = Pattern.compile(englishPattern).matcher(resultStatsText);
        Matcher hebrewMatcher = Pattern.compile(hebrewPattern).matcher(resultStatsText);
        Reporter.log("Found string ["+resultStatsText+"]");
        if (matcher.find()){ //ugly code, but I just wanted it to work
            return getNumberFromPattern(matcher);
        }else if (hebrewMatcher.find()){
            return getNumberFromPattern(hebrewMatcher);
        }
        Reporter.log("Didn't find a number of results. The value was ["+resultStatsText+"]");
        return 0;
    }

    private int getNumberFromPattern(Matcher matcher) {
        String numberText = matcher.group(1);
        Reporter.log("Found ["+numberText+"]");
        return Integer.parseInt(numberText.replaceAll("[^\\d]",""));
    }
}
