package emg.discovery.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String getHelloGet(
            @RequestHeader("user-greeting") String userGreeting,
            @PathVariable("name") String name
    ) {
        log.debug("calling getHelloGet with name: {}", name);
        return String.format("[GET] Hello %s. %s", name, userGreeting);
    }

    @PostMapping("/hello")
    public String getHelloPost(
            @RequestHeader("user-greeting") String userGreeting,
            @RequestBody String name
    ) {
        log.debug("calling getHelloPost with name: {}", name);
        return String.format("[POST] Hello %s. %s", name, userGreeting);
    }
}
