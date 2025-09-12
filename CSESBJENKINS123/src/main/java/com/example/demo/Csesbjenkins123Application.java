package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Csesbjenkins123Application {

	public static void main(String[] args) {
		SpringApplication.run(Csesbjenkins123Application.class, args);
	}
	@GetMapping("/mine")
	public String disp() {
		return "MINE WELOME";
	}

}
