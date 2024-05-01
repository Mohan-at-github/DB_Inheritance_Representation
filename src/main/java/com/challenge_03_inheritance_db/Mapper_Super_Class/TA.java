package com.challenge_03_inheritance_db.Mapper_Super_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_TA")
public class TA extends User{
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
