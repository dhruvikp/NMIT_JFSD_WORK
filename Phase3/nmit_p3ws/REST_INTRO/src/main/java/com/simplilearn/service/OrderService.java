package com.simplilearn.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	public String placeOrder(int id) {
		return "Order placed: " + id;
	}
}
