package com.jerseyflow.user.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Global exception handler for the application.
 */

@Provider //
public class GlobalExceptionHandler implements ExceptionMapper<Exception> {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * Handles all exceptions thrown by the application.
     * @param e The exception that was thrown.
     * @return A Response object with an error message.
     */
    @Override
    public Response toResponse(Exception e) {
        logger.error("An error occurred: {}", e.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("{\"error\": \"" + e.getMessage() + "\"}")
                .build();
    }
}
