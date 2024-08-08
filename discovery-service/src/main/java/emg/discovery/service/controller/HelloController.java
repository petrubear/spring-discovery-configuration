package emg.discovery.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String getHelloGet() {
        log.debug("calling getHelloGet");
        return "[GET] Hello from discovery-service!";
    }

    @PostMapping("/hello")
    public String getHelloPost() {
        log.debug("calling getHelloPost");
        return "[POST] Hello from discovery-service!";
    }
}
