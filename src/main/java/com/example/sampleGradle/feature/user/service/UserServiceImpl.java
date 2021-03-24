package com.example.sampleGradle.feature.user.service;

import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;
import com.example.sampleGradle.feature.user.interactor.CreateUser;
import com.example.sampleGradle.feature.user.interactor.GetAllUsers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final CreateUser createUser;
    private final GetAllUsers getAllUsers;

    @Override
    public User createUser(UserDto user) {
        System.out.println("SERVICE IMPL: "+user);
        return createUser.execute(user);
    }

    @Override
    public List<User> getAllUsers() {
        return getAllUsers.users();
    }
}
