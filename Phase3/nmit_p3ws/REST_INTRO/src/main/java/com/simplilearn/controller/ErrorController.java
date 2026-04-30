package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.service.OrderService;

@RestController
public class ErrorController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/order")
	public void placeOrder() {
		orderService.placeOrder(3);
	}
	
	
	@GetMapping("/calculate")
	public Integer calculate() {
		int a = 6;
		int b = 0;
		
		int result = a/b;
		
		return result;
	}
}