package com.example.shoppingcart.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingcart.dao.UserDao;
import com.example.shoppingcart.model.User;
import com.example.shoppingcart.service.ServiceInterface;

@Service
public class ServiceImplement implements ServiceInterface{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
		
	}

	@Override
	public String addUser(User user) {
		User user1=userDao.save(user);
		return user1.getUserName();
	}

}
