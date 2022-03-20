package com.jay_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//Particular class to handle request we use @RestController
@RestController
public class JPHApplication {

	//
	@GetMapping("/")
    public String rootRoute () {

		return "you are home";

	}
	public static void main(String[] args) {
		SpringApplication.run(JPHApplication.class, args);
	}

}
