package com.example.Server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//  two type of scope of bean is there 1. singleton and 2. prototype 
public class SingletonEx {

	private String name;

	public String getName() {
		return name;
	}

	@Value("Siva")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SingletonEx [name=" + name + "]";
	}

	public SingletonEx() {
		System.out.println("Bean is created...");
	}

}
