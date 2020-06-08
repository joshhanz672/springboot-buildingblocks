package com.stacksimplify.restservices.Hello2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Controller
@RestController
public class HelloWorldController2 {

	//Simple method
	//URI - /helloworld2
	//GET 
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld2")
	@GetMapping("/helloworld1")
	public String helloWorld2()
	{
		
		return "Hello World";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails2 helloWorldBean()
	{
		return new UserDetails2("Josh", "Hanz", "Palo Alto");
	}
	
}
