package com.example.for_dummies.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.for_dummies.model.User;
import com.example.for_dummies.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository  UserRepo ;
	
	@Autowired
	private PasswordEncoder passwordEncoder ;
	
	public User createUser(User user) {  
		//hash pass before saving
		String hashPass = passwordEncoder.encode(user.getPassword());
		user.setPassword(hashPass);
        return UserRepo.save(user); 
    }
}
