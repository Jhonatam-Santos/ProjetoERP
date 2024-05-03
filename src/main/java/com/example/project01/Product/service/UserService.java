package com.example.project01.User.service;

import com.example.project01.User.dto.UserDto;

public interface UserService {
    UserDto creaUser(UserDto userDto);
    UserDto getUserById(Long userId);
}
