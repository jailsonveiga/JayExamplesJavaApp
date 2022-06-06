package com.jay_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JPHApplication {
	@RequestMapping("/ping")
	public String pong () {
		return "pong";
	}

	@GetMapping("/")
    public String rootRoute () {
		return "you are home";
	}
	public static void main(String[] args) {
		SpringApplication.run(JPHApplication.class, args);
	}
}
