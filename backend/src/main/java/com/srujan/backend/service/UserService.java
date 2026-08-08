package com.srujan.backend.service;

import com.srujan.backend.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}