package com.challenge_03_inheritance_db.Table_Per_Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "TPC_User")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}

