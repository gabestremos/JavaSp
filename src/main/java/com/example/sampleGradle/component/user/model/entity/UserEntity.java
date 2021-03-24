package com.example.sampleGradle.component.user.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;
@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
    private String email;
}
