package com.jerseyflow.user;

import org.glassfish.jersey.server.ResourceConfig;

public class UserServiceApplication extends ResourceConfig {
    public UserServiceApplication() {
        packages("com.jerseyflow.user");
    }

}