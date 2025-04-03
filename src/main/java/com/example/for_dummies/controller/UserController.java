package com.example.for_dummies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.for_dummies.model.User;
import com.example.for_dummies.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService UserSer ;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }	
    
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return UserSer.createUser(user); 
    }

    
}
