package com.challenge_03_inheritance_db.Single_Table;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "ST_learners")
public class Learner extends User {
    private String college;
    private String company;
    private double psp;
}
