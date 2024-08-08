package emg.discovery.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String getHelloGet(@PathVariable("name") String name) {
        log.debug("calling getHelloGet with name: {}", name);
        return "[GET] Hello " + name;
    }

    @PostMapping("/hello")
    public String getHelloPost(@RequestBody String name) {
        log.debug("calling getHelloPost with name: {}", name);
        return "[POST] Hello " + name;
    }
}
