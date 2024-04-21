package com.example.project01.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;

import com.example.project01.domain.user.User;
import com.example.project01.domain.user.UserRepository;
import com.example.project01.dto.UserDto;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @SuppressWarnings("rawtypes")
    @GetMapping("/getAllUsers")
    public ResponseEntity getMethodName() {
        var users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
    
    @GetMapping("/findUserById/{id}")
    public User getUser(@RequestParam Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return (User) user.get();
        }
        return null;
    }
    
    @SuppressWarnings("rawtypes")
    @PostMapping("/addUser")
    public ResponseEntity addUser(@RequestBody @Valid UserDto data) {
        User user = new User(data);
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/updateUser/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        return entity;
    }
}
