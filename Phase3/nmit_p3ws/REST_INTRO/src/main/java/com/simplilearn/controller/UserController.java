package com.simplilearn.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return new User(id, "Dhruvik");
	}
	
	@PostMapping
	public String createUser(@RequestBody User user) {
		return "User created :" + user.getName();
	}
	
	@PutMapping("/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		return "User updated: " + id;
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		return "User deleted: "+id;
	}
}
