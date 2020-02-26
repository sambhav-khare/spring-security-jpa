package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "welcome";
	}

	@GetMapping("/user")
	public String user() {
		return "welcome user (not secured)";
	}

	@GetMapping("/admin")
	public String admin() {
		return "welcome admin (not secured)";
	}
}
