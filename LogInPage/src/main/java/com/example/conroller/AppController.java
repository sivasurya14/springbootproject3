package com.example.conroller;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.User;
import com.login.repository.UserRepository;

@Controller
	public class AppController {
	    
	    @Autowired
	    private UserRepository userRepo;
	        
	    @GetMapping("/")
	    public String viewHomePage() {
	        return "index";
	    }
	    
	    @GetMapping("/register")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("user", new User()); 
	        return "signup_form";
	    }
	    
	}



