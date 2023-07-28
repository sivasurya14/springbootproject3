package com.login.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.conroller.AppController;

@SpringBootTest
class LogInPageApplicationTests {
	@Autowired
	AppController ac;

	@Test
	void contextLoads() {
	}

	@Test
	public void sample() {
		System.out.println(ac.viewHomePage());
	}
	
}
