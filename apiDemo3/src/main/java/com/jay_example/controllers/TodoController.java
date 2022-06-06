package com.jay_example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping ("/todo")
public class TodoController {


    @GetMapping
    public String getTodo () {
        return "Todo Route";
    }

    @GetMapping("/{id}")
    public Object getTodo (RestTemplate restTemplate, @PathVariable("id") String todoId) {

        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + todoId, Object.class);

        return requestData;
    }
}
