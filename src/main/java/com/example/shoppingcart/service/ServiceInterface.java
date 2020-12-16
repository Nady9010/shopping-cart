package com.example.shoppingcart.service;

import com.example.shoppingcart.model.User;

public interface ServiceInterface {
	
	public User login(String username, String password);
	
	public String addUser(User user);

}
