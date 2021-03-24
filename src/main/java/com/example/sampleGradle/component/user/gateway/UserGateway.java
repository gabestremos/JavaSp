package com.example.sampleGradle.component.user.gateway;

import com.example.sampleGradle.component.user.model.domain.User;

import java.util.List;

public interface UserGateway {
    User save(User user);
    List<User> getAllUsers();
}
