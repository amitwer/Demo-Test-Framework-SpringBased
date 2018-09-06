package springbasedframework.reporting;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * A utility to add logging across the different reports we might have. Currently implements Allure framework for HTML report generation
 */
public class Reporter {
    private Reporter() {
    }

    @SuppressWarnings("unused")
    @Step("{s}")
    public static void log(String s) {
        //empty because the annotation is doing all of the work
    }

    /**
     * Takes screenshot if the driver is capable of taking screenshots.
     * Headless drivers will just do nothing here.
     *
     * @param driver - The webriver from which to take the screenshot.
     * @param label  - How to name the screenshot (the prefix "Screenshot" will be added
     */
    public static void addScreenShot(WebDriver driver, String label) {
        if (driver instanceof TakesScreenshot) {
            takeScreenShort((TakesScreenshot) driver, label);
        }

    }


    @SuppressWarnings("UnusedReturnValue") //return value is used by the annotation. supressing warning for static code analysis
    @Attachment(value = "Screenshot {label}", type = "image/png")
    private static byte[] takeScreenShort(TakesScreenshot driver, String label) {
        return driver.getScreenshotAs(OutputType.BYTES);
    }
}
