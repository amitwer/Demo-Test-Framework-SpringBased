package springbasedframework.tests;

import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import spring.ApplicationConfiguration;
import springbasedframework.reporting.Reporter;
import springbasedframework.rest.PwndEntry;
import springbasedframework.rest.RestService;

import java.util.List;

@SpringBootTest(classes = ApplicationConfiguration.class)
public class MyFirstApiTest extends AbstractTestNGSpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(MyFirstApiTest.class);

    @Autowired
    private RestService restService;

    @Test
    public void testHaveIBeenPwnd() {
        List<PwndEntry> pwndEntries = restService.haveIBeenPwnd("amit@mailinator.com");
        Assertions.assertThat(pwndEntries).isNotEmpty();
        Reporter.log("got " + pwndEntries.size() + " entries");
        pwndEntries.stream().map(PwndEntry::getDomain).map(s -> "Stolen from[" + s + "]").forEach(log::debug);
    }

}
