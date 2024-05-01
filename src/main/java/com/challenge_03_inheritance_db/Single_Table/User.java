package com.challenge_03_inheritance_db.Single_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "ST_User") //name overriding because we are creating all 4 inheritance representations of the same table name
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}

