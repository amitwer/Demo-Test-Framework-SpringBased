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
import springbasedframework.rest.LotrBooks;
import springbasedframework.rest.RestService;

@SuppressWarnings("unused")
@SpringBootTest(classes = ApplicationConfiguration.class)
public class MyFirstApiTest extends AbstractTestNGSpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(MyFirstApiTest.class);

    @Autowired
    private RestService restService;

    @Test
    public void testRestAPI() {
        LotrBooks books = restService.allLotrBooks();
        Reporter.log("got " + books.getNumOfBooks() + " entries");
        Assertions.assertThat(books.getNumOfBooks()).isEqualTo(3);
    }

}
