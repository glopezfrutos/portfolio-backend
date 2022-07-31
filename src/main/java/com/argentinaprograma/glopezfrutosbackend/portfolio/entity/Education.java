package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String institution;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 500, nullable = false)
    private String description;

    @Column(length = 1500, nullable = false)
    private String imgUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EducationCategory educationCategory;
}