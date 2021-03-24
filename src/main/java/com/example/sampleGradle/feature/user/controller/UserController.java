package com.example.sampleGradle.feature.user.controller;

import com.example.sampleGradle.component.user.mapper.UserMapper;
import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;
import com.example.sampleGradle.component.user.model.entity.UserEntity;
import com.example.sampleGradle.component.user.repository.UserRepository;
import com.example.sampleGradle.feature.user.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @PostMapping
    public User createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostConstruct
    public void saveUser(){
        UserEntity user1=new UserEntity();
        user1.setFirstName("asd");
        user1.setEmail("qq@qq.com");
        user1.setId(1l);
        user1.setLastName("qq@qq.com");
        user1.setMiddleName("qq@qq.com");
        user1.setAge(22);
        System.out.println(user1);
        userRepository.save(user1);
    }
}
