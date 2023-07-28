package com.example.Server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Value("${env.running}")
	String appProperties;	
	@GetMapping("/profile")
	public String getProfile() {
		
		return "environment =" + appProperties;
	}

}
