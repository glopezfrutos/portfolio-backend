package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "experience")
@Data
@NoArgsConstructor
public class Experience {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company", length = 30, nullable = false)
    private String company;

    @Column(name = "role", length = 30, nullable = false)
    private String role;

    @Column(name = "description", length = 500, nullable = false)
    private String description;

    @Column(name = "imgUrl", length = 150, nullable = false)
    private String imgUrl;
}