package com.springboot.UberApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcometoUber {
	@GetMapping("/welcome")
	public String welcometoUber () {
		return "welcome DR. Mohamed Samir to our Transportation app Uber";
		
	}	
	
}
