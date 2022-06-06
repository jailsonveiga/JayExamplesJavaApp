package com.jay_example.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping ("/user")
public class UserController {

    @GetMapping
    public String getUser () {
        return "User Route";
    }

    @GetMapping("/{id}")
    public Object getUser (RestTemplate restTemplate, @PathVariable("id") String userId) {

        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + userId, Object.class);

        return requestData;
    }

    @PostMapping
    public Object create (
            RestTemplate restTemplate,
            @RequestParam(value= "name", defaultValue = "___") String name,
            @RequestParam("email") String email,
            @RequestParam("username") String username,
            @RequestParam("phone") String phone
    ) {
        System.out.println("\n\n\nUSER: \n" + "\nname: " + name + "\nemail: " + email + "\nusername: " + username + "\nphone: " + phone + "\n\n");

//        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + name, Object.class);

        return "Creating user failed";
    }
}
