package com.example.for_dummies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.for_dummies.model.User;
import com.example.for_dummies.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class UserController {
    @Autowired
    private UserRepo userRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest request) {
        String response = userService.signup(request);
        return ResponseEntity.ok(response);
    }


    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest request) {
        ResponseEntity<Map<String, String>> response = userService.signin(request);
        return response;
    }


}