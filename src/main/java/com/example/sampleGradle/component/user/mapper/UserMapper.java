package com.example.sampleGradle.component.user.mapper;

import com.example.sampleGradle.component.user.model.domain.User;
import com.example.sampleGradle.component.user.model.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(User user);
    User toDomain(UserEntity userEntity);
}
