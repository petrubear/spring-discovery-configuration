package emg.discovery.client.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "discovery-service")
public interface HelloClient {

    @PostMapping(value = "/api/hello")
    String hello(@RequestHeader("user-greeting") String userGreeting,
                 @RequestBody String name);
}
