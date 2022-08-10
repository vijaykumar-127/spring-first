package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/hi")
	public String welcome()
	{
		return "Hello World....! Welcome to springboot";
	}

}
