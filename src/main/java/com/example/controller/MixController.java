package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixController {
	
	@GetMapping(value="/mix")
	public String getData() {
		return " I am coming from mix Services";
	}

}
