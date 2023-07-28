package com.example.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

  @Autowired
  ApplicationContext app;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi...");
		SingletonEx e1 =app.getBean(SingletonEx.class);
		System.out.println(e1.hashCode());
	//	System.out.println(e1);
		e1.setName("dinesh");
		System.out.println(e1);
		SingletonEx e2 =app.getBean(SingletonEx.class);
		System.out.println(e2.hashCode());
		System.out.println(e2);
		
	}
}
