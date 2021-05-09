package springbasedframework.rest;

import io.qameta.allure.Step;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    @Step("Checking which LOTR books are there")
    public LotrBooks allLotrBooks() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<LotrBooks> lotrBooks = restTemplate.exchange("https://the-one-api.dev/v2/book", HttpMethod.GET, httpEntity, LotrBooks.class);
        return (lotrBooks.getBody());

    }
}
