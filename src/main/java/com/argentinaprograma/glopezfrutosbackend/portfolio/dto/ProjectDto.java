package com.argentinaprograma.glopezfrutosbackend.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDto {
    private int id;
    private String title;
    private String description;
    private String deploy;
    private String repository;
    private String imgUrl;
}
