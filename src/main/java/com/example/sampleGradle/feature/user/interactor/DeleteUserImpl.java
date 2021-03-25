package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserImpl implements DeleteUser{
    private final UserGateway userGateway;
    @Override
    public void execute(Long id) {
        userGateway.deleteUser(id);
    }
}
