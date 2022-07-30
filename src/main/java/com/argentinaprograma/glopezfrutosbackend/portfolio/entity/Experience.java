package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, nullable = false)
    private String company;

    @Column(length = 30, nullable = false)
    private String role;

    @Column(length = 500, nullable = false)
    private String description;

    @Column(length = 1500, nullable = false)
    private String imgUrl;
}