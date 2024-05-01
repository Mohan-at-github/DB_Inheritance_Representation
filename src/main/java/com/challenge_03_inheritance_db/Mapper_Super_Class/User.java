package com.challenge_03_inheritance_db.Mapper_Super_Class;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}

