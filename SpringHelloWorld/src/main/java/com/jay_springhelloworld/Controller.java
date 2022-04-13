package com.jay_springhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.Arrays;

@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping ("/test")
    public String testRoute() {
        return "test";
    }

    @GetMapping ("/jsonplaceholder/getPosts")
    public String getPosts () {
        return restTemplate.getForObject("https://my-json-server.typicode.com/jailsonveiga/demo/posts", String.class);

    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return restTemplate.postForObject("https://my-json-server.typico.com/jailsonveiga/demo/posts", post, Post.class);
    }
}
