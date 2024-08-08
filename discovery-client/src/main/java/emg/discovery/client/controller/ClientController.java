package emg.discovery.client.controller;

import emg.discovery.client.model.ClientResponse;
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
        var getResponse = restTemplate.getForObject(url + "/edison", String.class);
        var postResponse = helloClient.hello("edison");

        return ClientResponse.of(getResponse, postResponse);
    }
}
