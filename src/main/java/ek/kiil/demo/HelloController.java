package ek.kiil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/api/hello")
    String hello() {
        return "Hello, anyone can see this";
    }
}
