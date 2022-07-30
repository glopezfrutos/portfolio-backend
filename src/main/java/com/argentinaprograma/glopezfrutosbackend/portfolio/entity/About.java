package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String subtitle;

    @Column(length = 50, nullable = false)
    private String shortDescription;

    @Column(length = 600, nullable = false)
    private String longDescription;

    @Column(length = 1500, nullable = false)
    private String imgUrl;
}