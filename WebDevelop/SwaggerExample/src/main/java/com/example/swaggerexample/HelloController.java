package com.example.swaggerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	@GetMapping("/api/hello")
	public String sayHello() {
		return "Swagger Hello World";
	}
}
