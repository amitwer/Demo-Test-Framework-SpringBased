package spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ConfigurationProperties
@ComponentScan(basePackages = "springbasedframework")
public class ApplicationConfiguration {


        public static void main(String[] args) {
            SpringApplication.run(ApplicationConfiguration.class, args);
        }
}
