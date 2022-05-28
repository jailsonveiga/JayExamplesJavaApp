package com.example.demo.JsonPlaceHolderAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonPlaceHolderController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String helloGoodBye() {
        return "Goodbye from Spring Boot";
    }
}
