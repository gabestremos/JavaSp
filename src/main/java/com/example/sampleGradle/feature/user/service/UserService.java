package com.example.sampleGradle.feature.user.service;

import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;

import java.util.List;


public interface UserService {
     User createUser(UserDto user);
     List<User> getAllUsers();
     User getUser(Long id);
     void deleteUser(Long id);
     User updateUser(Long id,UserDto user);
}
