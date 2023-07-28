package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWebTest {
	
	
	@GetMapping("/get")
    public String getStudent() {
		
		return "Student";
	}
	@GetMapping("/getAdmin")
	
	public String getAdmin() {
		return "Welcome to admin";
	}
	
	@GetMapping("/getManagager")
	public String getManager() {
		return "Welcome to Manager";
	}
}
