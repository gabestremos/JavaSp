package com.example.sampleGradle.component.user.gateway;

import com.example.sampleGradle.component.user.mapper.UserMapper;
import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.entity.UserEntity;
import com.example.sampleGradle.component.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User save(User user) {
        return userMapper.toDomain(userRepository.save(userMapper.toEntity(user)));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user->userMapper.toDomain(user))
                .collect(Collectors.toList());
    }

    @Override
    public User getUser(Long id) {
        return userMapper.toDomain(userRepository.getOne(id));
    }

    @Override
    public void deleteUser(Long id) {
        User existingUser=getUser(id);
        userRepository.delete(userMapper.toEntity(existingUser));
    }

    @Override
    public User updateUser(User user) {
        return userMapper.toDomain(userRepository.save(userMapper.toEntity(user)));
    }
}
