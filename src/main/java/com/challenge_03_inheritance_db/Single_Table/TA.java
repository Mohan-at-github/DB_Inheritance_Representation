package com.challenge_03_inheritance_db.Single_Table;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "ST_TA")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
