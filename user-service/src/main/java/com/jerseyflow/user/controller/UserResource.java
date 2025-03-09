package com.jerseyflow.user.controller;

import com.jerseyflow.user.dto.UserDto;
import com.jerseyflow.user.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

/**
 * REST endpoints for user operations.
 */
@Path("/users")
@Produces (MediaType.APPLICATION_JSON) // All endpoints will produce JSON
@Consumes(MediaType.APPLICATION_JSON) // All endpoints will consume JSON
public class UserResource {

    @Inject
    private UserService userService;

    /**
     * Retrieves all users from the database.
     * @return List of UserDto objects.
     */
    @GET
    public Response getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return Response.ok(users).build();
    }

    /**
     * Creates a new user.
     * @param userDto The UserDto object containing user data.
     * @return The created UserDto object.
     */
    public Response createUser(UserDto userDto) {
        UserDto createdUser = userService.createUser(userDto);
        return Response.status(Response.Status.CREATED)
                .entity(createdUser)
                .build();
    }
}
