package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.gateway.UserGateway;
import com.example.sampleGradle.component.user.model.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserImpl implements GetUser{
    private final UserGateway userGateway;
    @Override
    public User execute(Long id) {
        return userGateway.getUser(id);
    }
}
