package com.argentinaprograma.glopezfrutosbackend.portfolio.dto;

import com.argentinaprograma.glopezfrutosbackend.portfolio.entity.SkillCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkillDto {
    private int id;
    private String skillName;
    private String description;
    private int percentage;
    private SkillCategory skillCategory;
    private String imgUrl;
}
