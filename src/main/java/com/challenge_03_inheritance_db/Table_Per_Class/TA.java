package com.challenge_03_inheritance_db.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "TPC_TA")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
