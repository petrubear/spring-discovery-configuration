package emg.discovery.client.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "discovery-service")
public interface HelloClient {

    @PostMapping(value = "/api/hello")
    String hello(@RequestBody String name);
}
