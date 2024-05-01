package com.challenge_03_inheritance_db.Joined_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "JT_User")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}

