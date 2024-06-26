package com.example.project01.User.service;

import java.util.List;

import com.example.project01.User.dto.UserDto;

public interface UserService {
    UserDto creaUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto updateUser);
    void deleteUser(Long userId);
}
