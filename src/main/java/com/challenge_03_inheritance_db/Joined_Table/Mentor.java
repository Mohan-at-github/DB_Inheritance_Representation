package com.challenge_03_inheritance_db.Joined_Table;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "JT_mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
    private int noOfSessionAttended;
}
