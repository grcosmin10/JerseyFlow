package com.jerseyflow.user.config;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;

import java.io.IOException;

/**
 * Handles Cross-Origin Resource Sharing (CORS) for the API.
 * Allows external applications to make requests to the backend.
 */

public class CorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*"); // Allow all origins
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization"); // Allow these headers
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true"); // Allow credentials
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD"); // Allow these methods
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600"); // Set the maximum age
    }
}
