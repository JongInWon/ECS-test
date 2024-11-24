package com.example.ecstest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HomeController {

	@PostMapping("/")
	public String save() {
		return "Hello World!";
	}
}
