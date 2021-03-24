package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.gateway.UserGateway;
import com.example.sampleGradle.component.user.model.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllUsersImpl implements GetAllUsers{
    private final UserGateway userGateway;
    @Override
    public List<User> users() {
        return userGateway.getAllUsers();
    }
}
