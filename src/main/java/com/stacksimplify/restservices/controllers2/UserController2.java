package com.stacksimplify.restservices.controllers2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.entities2.User2;
import com.stacksimplify.restservices.services2.UserService2;

//Controller - 
@RestController
public class UserController2 {
	
	//Autowire the UserService
	@Autowired
	private UserService2 userService2;
	
	//getAllUsers Method
	@GetMapping("/users2")
	public List<User2> getAllUsers()
	{
		return userService2.getAllUsers();
	}
	
	//Create User Method
	//@RequestBody Annotation
	//@PostMapping Annotation
	@PostMapping("/users2")
	public User2 createUser2(@RequestBody User2 user2)
	{
		return userService2.createUser2(user2);
	}
	
	//getUserById
	@GetMapping("users2/{id}")
	public Optional<User2> getUserById2(@PathVariable("id") Long id)
	{
		return userService2.getUserById2(id);
		
	}
	
	//updateUserById
	@PutMapping("/users2/{id}")
	public User2 updateUserById2(@PathVariable("id") Long id, @RequestBody User2 user)
	{
		return userService2.updateUserById2(id, user);
	}
	
	//deleteUserById
	@DeleteMapping("/users2/{id}")
	public void deleteUserById(@PathVariable("id") Long id)
	{
		userService2.deleteUserById2(id);
	}
	
	//getUserByUserName
	@GetMapping("/users2/byusername/{username}")
	public User2 getUserByUsername(@PathVariable("username") String username)
	{
		return userService2.getUserByUsername2(username);
	}
	
}
