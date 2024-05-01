package com.challenge_03_inheritance_db.Joined_Table;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "JT_learners")
public class Learner extends User {
    private String college;
    private String company;
    private double psp;
}
