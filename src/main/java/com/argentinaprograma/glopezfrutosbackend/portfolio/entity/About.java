package com.argentinaprograma.glopezfrutosbackend.portfolio.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "about")
@Data
@NoArgsConstructor
public class About {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;

    @Column(name = "subtitle", length = 50, nullable = false)
    private String subtitle;

    @Column(name = "shortDescription", length = 50, nullable = false)
    private String shortDescription;

    @Column(name = "longDescription", length = 600, nullable = false)
    private String longDescription;
}