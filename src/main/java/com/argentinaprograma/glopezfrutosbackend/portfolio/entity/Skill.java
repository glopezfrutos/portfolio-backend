package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String skillName;

    @Column(length = 500, nullable = false)
    private String description;

    @Column(nullable = false)
    private int percentage;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SkillCategory skillCategory;
}