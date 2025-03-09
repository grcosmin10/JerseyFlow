package com.jerseyflow.user.service;

import com.jerseyflow.user.dto.UserDto;
import com.jerseyflow.user.model.mapper.UserMapper;
import com.jerseyflow.user.repository.UserRepository;
import jakarta.inject.Inject;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Service class for user-related operations.
 */
public class UserService {

    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    @Inject
    private UserRepository userRepository;

    /**
     * Retrieves all users from the database.
     */
    public List<UserDto> getAllUsers() {
        logger.info("Retrieving all users from the database");
        return userRepository.findAll()
                .stream()
                .map(UserMapper.INSTANCE::userToDto)
                .collect(Collectors.toList());
    }

    /**
     * Creates a new user.
     * @param userDto The UserDto object containing user data.
     * @return The created UserDto object.
     */
    public UserDto createUser(UserDto userDto) {
        logger.info("Creating a new user: ");
        userRepository.save(UserMapper.INSTANCE.dtoToUser(userDto));
        return userDto;
    }
}
