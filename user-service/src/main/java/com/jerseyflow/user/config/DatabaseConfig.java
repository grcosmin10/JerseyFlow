package com.jerseyflow.user.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Configures the EntityManagerFactory for database connections using JPA.
 */
public class DatabaseConfig {
    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("user-service");

    /**
     * Returns the EntityManagerFactory instance.
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
