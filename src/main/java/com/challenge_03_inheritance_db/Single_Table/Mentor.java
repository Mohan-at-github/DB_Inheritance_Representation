package com.challenge_03_inheritance_db.Single_Table;
import jakarta.persistence.Entity;



@Entity(name = "ST_mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
    private int noOfSessionAttended;
}
