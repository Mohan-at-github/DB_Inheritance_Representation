package com.challenge_03_inheritance_db.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "TPC_learners")
public class Learner extends User {
    private String college;
    private String company;
    private double psp;
}
