package com.mircoservices.practise.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome!!";
	}

}
