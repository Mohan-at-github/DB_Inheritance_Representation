package com.challenge_03_inheritance_db.Joined_Table;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "JT_TA")
public class TA extends User {
    private String college;
    private double avgRating;
    private int noOfQuestionsResolved;
}
