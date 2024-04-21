package com.example.project01.mapper;

import com.example.project01.domain.user.User;
import com.example.project01.dto.UserDto;

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
