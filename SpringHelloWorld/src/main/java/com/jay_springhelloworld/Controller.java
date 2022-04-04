package com.jay_springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping ("/test")
    public String testRoute() {
        return "test";
    }
}
