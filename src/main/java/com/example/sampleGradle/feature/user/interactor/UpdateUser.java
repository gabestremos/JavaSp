package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.dto.UserDto;

public interface UpdateUser {
    User execute(Long id,UserDto user);
}
