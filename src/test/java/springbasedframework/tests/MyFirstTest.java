package springbasedframework.tests;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import springbasedframework.reporting.Reporter;

public class MyFirstTest extends AbstractTestNGSpringContextTests {

    @Test
    public void passingTest() {
       Reporter.log("This test always passes");
    }

    @Test(enabled = false)
    public void failingTest() {
        Assert.fail("Failing test");
    }

    @Test (dataProvider = "dataProvider")
    public  void testWithDataProvider(String line){
        Reporter.log(line);
    }


    @DataProvider
    public Object[] dataProvider(){
        return new Object[]{"Hello","World"};

    }

}
