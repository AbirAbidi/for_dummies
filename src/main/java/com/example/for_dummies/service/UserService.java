package com.example.for_dummies.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_dummies.model.User;
import com.example.for_dummies.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository  UserRepo ;
	
	public User createUser(User user) {  // Accepting the full User object
        return UserRepo.save(user);  // Save the user object to the repository
    }
}
