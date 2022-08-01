package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 500, nullable = false)
    private String description;

    @Column(length = 100)
    private String deploy;

    @Column(length = 100, nullable = false)
    private String repository;

    @Column(length = 1500)
    private String imgUrl;
}