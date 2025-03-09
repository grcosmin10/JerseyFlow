package com.jerseyflow.user.model.mapper;

import com.jerseyflow.user.dto.UserDto;
import com.jerseyflow.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Converts User entity to UserDto and vice versa.
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToDto(User user);
    User dtoToUser(UserDto userDto);
}
