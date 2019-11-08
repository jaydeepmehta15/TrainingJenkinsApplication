package com.training.Application1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@RequestMapping("/hello")
	public String doSomething() {
		
		
		return "Hello World";
	}
	
	
}
