package com.example.for_dummies.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.for_dummies.model.User;

@Repository
public interface UserRepository  extends MongoRepository<User,String> {
	
    User findByEmail(String email);

}
