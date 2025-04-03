package com.example.for_dummies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.for_dummies.repo")
public class ForDummiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForDummiesApplication.class, args);
    }
}
