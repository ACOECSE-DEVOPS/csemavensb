package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/data")
	public String rocks() {
		return "WELCOME TO JNEKINS WORLD FROM ACET FINAL YEAR";
	}

}
