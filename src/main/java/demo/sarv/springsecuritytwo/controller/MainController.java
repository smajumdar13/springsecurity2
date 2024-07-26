package demo.sarv.springsecuritytwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "Hello, this is the home directory.";
    }

    @GetMapping("/private")
    public String secure() {
        return "Secure access.";
    }
}
