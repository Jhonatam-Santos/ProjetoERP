package com.example.project01.User.impl;

import org.springframework.stereotype.Service;

import com.example.project01.User.dto.UserDto;
import com.example.project01.User.entity.User;
import com.example.project01.User.mapper.UserMapper;
import com.example.project01.User.repository.UserRepository;
import com.example.project01.User.service.UserService;
import com.example.project01.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto creaUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User is not exist with given id : " + userId));
        return UserMapper.mapToUserDto(user);
    }
}
