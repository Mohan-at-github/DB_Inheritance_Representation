package com.challenge_03_inheritance_db.Mapper_Super_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_mentor")
public class Mentor extends User{
    private String company;
    private double avgRating;
    private int noOfSessionAttended;
}
