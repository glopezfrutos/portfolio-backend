package com.argentinaprograma.glopezfrutosbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/login")
                        .allowedOrigins("http://localhost:4200/", "https://glopezfrutos.web.app/about")
                        .allowedMethods("POST");
                registry.addMapping("/api/v1/portfolio/**")
                        .allowedOrigins("http://localhost:4200/", "https://glopezfrutos.web.app/about");
            }
        };
    }
}