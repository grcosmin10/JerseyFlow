package com.jerseyflow.user.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Represents a user in the database.
 */
@Entity
@Table(name = "users")
@Getter @Setter // auto-generate getters and setters
@NoArgsConstructor // auto-generate no-args constructor
@AllArgsConstructor // auto-generate all-args constructor
@Builder // Enable the builder pattern for object creation
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String name;

    @Column(unique = true) // Ensures unique emails
    private String email;

    private String password;
}
