package springbasedframework.businessflows;

import org.openqa.selenium.WebDriver;
import springbasedframework.selenium.pageobjects.ResultsPage;
import springbasedframework.selenium.pageobjects.SearchPage;

public class SearchFlows {
    private SearchFlows() {
    }

    public static int search(WebDriver driver, String searchTerm) {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.open();
        searchPage.search(searchTerm);
        ResultsPage resultsPage = new ResultsPage(driver);
        return resultsPage.getNumOfResults();
    }
}
