package com.challenge_03_inheritance_db.Mapper_Super_Class;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date createdAt;
    private Date updatedAt;
}
