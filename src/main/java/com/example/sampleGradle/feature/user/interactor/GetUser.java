package com.example.sampleGradle.feature.user.interactor;

import com.example.sampleGradle.component.user.model.domain.User;

public interface GetUser {
    User execute(Long id);
}
