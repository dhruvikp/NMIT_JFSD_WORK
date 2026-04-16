package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.dao.EProductDAO;
import com.simplilearn.model.EProduct;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eProductDAO;
	
	@GetMapping("/listProducts")
	public String listProducts(Model model) {
		List<EProduct> products =  eProductDAO.getProducts();
		model.addAttribute("products", products);
		
		return "listProducts";
	}
	
}
