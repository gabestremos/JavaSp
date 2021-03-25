package com.example.sampleGradle.feature.user.service;

import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;
import com.example.sampleGradle.feature.user.interactor.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final CreateUser createUser;
    private final GetAllUsers getAllUsers;
    private final GetUser getUser;
    private final DeleteUser deleteUser;
    private final UpdateUser updateUser;

    @Override
    public User createUser(UserDto user) {
        return createUser.execute(user);
    }

    @Override
    public List<User> getAllUsers() {
        return getAllUsers.users();
    }

    @Override
    public User getUser(Long id) {
        return getUser.execute(id);
    }

    @Override
    public void deleteUser(Long id) {
        deleteUser.execute(id);
    }

    @Override
    public User updateUser(Long id,UserDto userDto) {
        return updateUser.execute(id,userDto);
    }
}
