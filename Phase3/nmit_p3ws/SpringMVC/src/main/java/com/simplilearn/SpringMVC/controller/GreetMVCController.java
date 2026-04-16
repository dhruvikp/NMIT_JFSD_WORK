package com.simplilearn.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMVCController {

	@GetMapping("/greet")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,  Model model) {
		
		// Business logic 
		
		// Populate Model
		model.addAttribute("name",name);
		
		return "hello";
	}
	
}
