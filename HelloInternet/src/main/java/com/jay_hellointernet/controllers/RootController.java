package com.jay_hellointernet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping()
    private String homePage () {
        return "We are in Home Page";
    }

    @GetMapping ("/hello")
    private String helloInternet () {
        return "You requested the root path hello";
    }
}
