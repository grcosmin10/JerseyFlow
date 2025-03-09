package com.jerseyflow.user.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Configures Jersey to scan the `controller` package for REST endpoints.
 */

@ApplicationPath("/api") // All endpoints will be prefixed with `/api`
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.jerseyflow.controller"); // Scan the `controller` package for endpoints
    }
}