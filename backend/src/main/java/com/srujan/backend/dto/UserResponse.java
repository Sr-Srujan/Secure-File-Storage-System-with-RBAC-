package com.srujan.backend.dto;

import com.srujan.backend.entity.User;

import java.util.List;

public class UserResponse {

    private Long id;
    private String username;
    private String email;
    private boolean enabled;
    private List<String> roles;

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();

        this.roles = user.getRoles()
                .stream()
                .map(role -> role.getName().name())
                .toList();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<String> getRoles() {
        return roles;
    }
}