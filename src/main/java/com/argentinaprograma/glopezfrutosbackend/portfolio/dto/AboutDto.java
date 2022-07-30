package com.argentinaprograma.glopezfrutosbackend.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AboutDto {
    private int id;
    private String name;
    private String subtitle;
    private String shortDescription;
    private String longDescription;
    private String imgUrl;
}
