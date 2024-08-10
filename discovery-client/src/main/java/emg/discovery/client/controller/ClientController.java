package emg.discovery.client.controller;

import emg.discovery.client.model.ClientResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final RestTemplate restTemplate;
    private final HelloClient helloClient;
    private final String url = "http://discovery-service/api/hello";

    public ClientController(RestTemplate restTemplate, HelloClient helloClient) {
        this.restTemplate = restTemplate;
        this.helloClient = helloClient;
    }

    @GetMapping("/hello")
    public ClientResponse hello() {
        var greeting = "Have a nice day!";
        var headerName = "user-greeting";
        var headers = new HttpHeaders();
        headers.add(headerName, greeting);
        var entity = new HttpEntity<>(headers);
        var getResponse = restTemplate.exchange(url + "/edison", HttpMethod.GET, entity, String.class);
        var postResponse = helloClient.hello(greeting, "edison");

        return ClientResponse.of(getResponse.getBody(), postResponse);
    }
}
