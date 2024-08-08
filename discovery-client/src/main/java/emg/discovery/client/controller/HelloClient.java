package emg.discovery.client.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "discovery-service")
public interface HelloClient {

    @PostMapping(value = "/api/hello")
    String hello();
}
