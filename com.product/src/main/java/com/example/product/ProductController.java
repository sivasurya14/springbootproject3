package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ProductController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/getProducts")

	public String getOrderApi() {
		String a = restTemplate.getForObject("http://localhost:8081/getOrders", String.class);

		return a;
	}

}
