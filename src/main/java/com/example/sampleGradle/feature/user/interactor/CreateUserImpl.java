package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.gateway.UserGateway;
import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateUserImpl implements CreateUser{
    private final UserGateway userGateway;
    @Override
    public User execute(UserDto user) {
        return userGateway.save(User.builder()
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .email(user.getEmail())
                .build());
    }
}
