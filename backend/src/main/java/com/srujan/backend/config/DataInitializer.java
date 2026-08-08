package com.srujan.backend.config;

import com.srujan.backend.entity.Role;
import com.srujan.backend.enums.RoleName;
import com.srujan.backend.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initializeRoles(RoleRepository roleRepository) {

        return args -> {

            if (!roleRepository.existsByName(RoleName.ROLE_USER)) {
                roleRepository.save(new Role(RoleName.ROLE_USER));
            }

            if (!roleRepository.existsByName(RoleName.ROLE_MANAGER)) {
                roleRepository.save(new Role(RoleName.ROLE_MANAGER));
            }

            if (!roleRepository.existsByName(RoleName.ROLE_ADMIN)) {
                roleRepository.save(new Role(RoleName.ROLE_ADMIN));
            }

            System.out.println("Roles initialized successfully.");
        };
    }
}