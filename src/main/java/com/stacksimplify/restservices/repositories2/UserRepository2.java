package com.stacksimplify.restservices.repositories2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.entities2.User2;

//Repository
@Repository
public interface UserRepository2 extends JpaRepository<User2, Long> {
	User2 findByUsername(String username);
	
 
}
