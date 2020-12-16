package com.example.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoppingcart.model.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsernameAndPassword(String username, String paasword);

}
