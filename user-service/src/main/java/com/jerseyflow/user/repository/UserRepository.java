package com.jerseyflow.user.repository;

import com.jerseyflow.user.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

/**
 * Handles database operations for the User entity.
 */
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Retreves all users from the database.
     * @return List of User entities.
     */
    public List<User> findAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    /**
     * Retrieves a user by their ID.
     * @param id The ID of the user.
     * @return The User entity.
     */
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    /**
     * Saves a new user to the database.
     * @param user The User entity to save.
     */
    public void save(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    /**
     * Updates an existing user in the database.
     * @param user The User entity to update.
     */
    public void update(User user) {
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }

}
