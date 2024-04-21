package com.example.project01.User.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.project01.User.dto.UserDto;
import com.example.project01.User.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@RestController
@RequestMapping("/api/User")
public class UserController {
    
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto savedUser = userService.creaUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    
}
