package com.example.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	@GetMapping(value="/getStudents")
	public String getStudent() {		
		return "Welcome to class";				
	}
	@GetMapping("/getTrainer")
	public String getTrainer() {
	return "Welcome to Onesoft";
	}	
	@GetMapping("/getManager")
	public String getManager() {
		return "Role Details";
	}
}
