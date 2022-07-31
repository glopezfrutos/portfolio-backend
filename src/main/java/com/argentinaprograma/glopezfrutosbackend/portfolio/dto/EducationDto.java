package com.argentinaprograma.glopezfrutosbackend.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDto {
    private int id;
    private String institution;
    private String title;
    private String description;
    private String imgUrl;
    private String educationCategory;
}
