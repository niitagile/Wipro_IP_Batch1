package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHandler {
	@Value("${my.greeting}")
	private String greeting;
	
	@Value("${my.list.values}")
	private List<String> names;
	
	@GetMapping("/greeting")
	public String getGreeting() {
		return greeting;
	}
	
	@GetMapping("/list")
	public List<String> getList() {
		return names;
	}

}
