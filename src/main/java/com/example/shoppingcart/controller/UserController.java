package com.example.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingcart.model.User;
import com.example.shoppingcart.service.ServiceInterface;

@RestController
public class UserController {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@GetMapping("/login/{userName}/{password}")
	public User login(@PathVariable String username, @PathVariable String password) {
		User user=serviceInterface.login(username, password);
		if(user==null)
			return new User();
		else 
			return user;
		
	}
	
	@PostMapping(value="/addUser", produces="application/x-www-form-urlencoded;charset=UTF-8")
	public String addUser(@RequestBody User user) {
		System.out.println(user);
		return serviceInterface.addUser(user);
	}

}
