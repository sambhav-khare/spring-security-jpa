package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@GetMapping("/user")
	public String user() {
		return "welcome secured user - <a href=\"http://localhost:8989/logout\">logout</a>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "welcome secured admin - <a href=\"http://localhost:8989/logout\">logout</a>";
	}
}
