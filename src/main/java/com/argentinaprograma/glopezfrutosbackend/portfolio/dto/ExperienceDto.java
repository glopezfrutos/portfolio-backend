package com.argentinaprograma.glopezfrutosbackend.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDto {
    private int id;
    private String company;
    private String role;
    private String description;
    private String imgUrl;
}
