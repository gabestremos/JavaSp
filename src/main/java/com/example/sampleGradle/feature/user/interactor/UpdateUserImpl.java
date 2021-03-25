package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.gateway.UserGateway;
import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserImpl implements UpdateUser{
    private final UserGateway userGateway;
    @Override
    public User execute(Long id,UserDto user) {
        return userGateway.updateUser(User.builder()
                .id(id)
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .email(user.getEmail())
                .build()

        );
    }
}
