package com.stacksimplify.restservices.services2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities2.User2;
import com.stacksimplify.restservices.repositories2.UserRepository2;

//Service
@Service
public class UserService2 {

	//Autowire the UserRepository
	@Autowired
	private UserRepository2 userRepository2;
	
	//getAllUsers Method
	public List<User2> getAllUsers() {
		return userRepository2.findAll();
		
	}
	
	//CreateUser Method
	
	public User2 createUser2(User2 user2)
	{
		return userRepository2.save(user2);
		
	}
	
	//getUserById
	public Optional<User2> getUserById2(Long id)
	{
		Optional<User2> user2 = userRepository2.findById(id);
		
		return user2;
	}
	
	//updateUserById2
	public User2 updateUserById2(Long id, User2 user)
	{
		user.setId(id);
		return userRepository2.save(user);
	}
	
	//deleteUserById
	public void deleteUserById2(Long id)
	{
		if (userRepository2.findById(id).isPresent() )
		{
			userRepository2.deleteById(id);
			
		}
	}
	
	
	//getUserByUserName
	
	public User2 getUserByUsername2(String username)
	{
		return userRepository2.findByUsername(username);
	}
	
}
