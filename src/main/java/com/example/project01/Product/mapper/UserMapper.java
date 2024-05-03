package com.example.project01.User.mapper;

import com.example.project01.User.dto.UserDto;
import com.example.project01.User.entity.User;

public class UserMapper {
    
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
            user.getId(),
            user.getName(),
            user.getCpf_cnpj(),
            user.getIn_ativo(),
            user.getEmail()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
            userDto.getId(),
            userDto.getName(),
            userDto.getCpf_cnpj(),
            userDto.getIn_ativo(),
            userDto.getEmail()
        );
    }
}
