package com.challenge_03_inheritance_db.Table_Per_Class;

import jakarta.persistence.*;



@Entity(name = "TPC_mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
    private int noOfSessionAttended;
}
